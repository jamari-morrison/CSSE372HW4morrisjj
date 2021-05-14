import java.util.List;

public abstract class ActivityFactory{
    protected List<ActivityInterface> allActivities;
    abstract ActivityInterface getActivity(Group group, List<ActivityInterface> currentActivities);

}
