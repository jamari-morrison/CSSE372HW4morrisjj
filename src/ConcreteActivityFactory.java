import java.util.List;

public class ConcreteActivityFactory extends ActivityFactory {
    int currActivityIndex = 0;

    public ConcreteActivityFactory(List<ActivityInterface> inputActivities){
        this.allActivities = inputActivities;
    }
    @Override
    ActivityInterface getActivity(Group group, List<ActivityInterface> currentActivities) {


        ActivityInterface output = null;
        ActivityInterface lastActivity = null;
        if(!currentActivities.isEmpty()) lastActivity = currentActivities.get(currentActivities.size()-1);
        while(true){
            currActivityIndex++;
            if(currActivityIndex >= allActivities.size()) return null;
            output = allActivities.get(currActivityIndex);

            if(output.getType().equals("activity")){
                if(lastActivity != null && output.mile - lastActivity.mile < 50 && lastActivity.getType().equals("activity")) continue;

                boolean matchesTheme = group.type.contains("free-wheeling");
                if(!matchesTheme){
                    for(String theme : output.themes){
                        if(group.type.contains(theme)) {
                            matchesTheme = true;
                            break;
                        }
                    }
                }
                if(!matchesTheme) continue;


                if(!output.cost.equals(group.extravagance)) continue;
                else if((output.numPeople == 1 && group.size != 1) || (output.numPeople == 3 && group.size == 1)) continue;
                else return output;

            }
            else if(output.getType().equals("hotel")){
                ActivityInterface lastHotel = null;
                for(ActivityInterface activity : currentActivities){
                    if(activity.getType().equals("hotel")) lastHotel = activity;
                }
                if(lastHotel != null && output.mile - lastHotel.mile < 200) continue;

                boolean matchesTheme = group.type.contains("free-wheeling");

                if(!matchesTheme){
                    for(String theme : output.themes){
                        if(group.type.contains(theme)) {
                            matchesTheme = true;
                            break;
                        }
                    }
                }

                if(!matchesTheme) continue;
                else if(!output.cost.equals(group.extravagance)) continue;
                else return output;

            } else continue;

        }
    }

    public void setActivities(List<ActivityInterface> activities){
        this.allActivities = activities;
    }
}
