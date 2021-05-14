import java.util.ArrayList;
import java.util.List;

public class Trip {
    Group group;
    ActivityFactory factory;
    List<ActivityInterface> activities;
    public Trip(Group group, List<ActivityInterface> allActivities){
        this.group = group;
        this.factory = new ConcreteActivityFactory(allActivities);
        this.activities = new ArrayList<>();
    }


    public void addActivities(){
        ActivityInterface nextActivity = factory.getActivity(group, activities);
        while(nextActivity != null){
            activities.add(nextActivity);
            nextActivity = factory.getActivity(group, activities);
        }
    }

    @Override
    public String toString() {
        return activities.toString();
    }
}
