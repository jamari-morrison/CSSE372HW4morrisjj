import java.util.Arrays;
import java.util.HashSet;

public class Activity extends ActivityInterface{
    //2 numPeople = any
    //1 numPeople = solo
    //3 numPeople = group

    public Activity(int mile, String name, String cost, String themes, int numPeople){
        this.cost = cost;
        this.name = name;
        this.mile = mile;
        this.numPeople = numPeople;
        this.themes = new HashSet<>(Arrays.asList(themes.split(", ")));
    }


    @Override
    String getType() {
        return "activity";
    }
}
