import java.util.Set;

public abstract class ActivityInterface implements Comparable<ActivityInterface>{
    int numPeople;
    int mile;
    String name;
    String cost;
    Set<String> themes;


    //2 numPeople = any
    //1 numPeople = solo
    //3 numPeople = group
    abstract String getType();

    @Override
    public int compareTo(ActivityInterface o) {
        return Integer.compare(this.mile, o.mile) ;

    }

    @Override
    public String toString() {
        return name;
    }
}
