import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main (String[] args){
        List<ActivityInterface> allActivities = new ArrayList<>();

            //add all activities,feel free to add more
            //2 numPeople = any
            //1 numPeople = solo
            //3 numPeople = group
            allActivities.add(new Activity(10, "World’s biggest ball of string", "cheap", "unusual", 2));
            allActivities.add(new Activity(200, "Wall Drug", "cheap", "unusual", 2));
            allActivities.add(new Activity(2, "Hearst Castle", "average", "unusual, publishing", 2));
            allActivities.add(new Activity(359, "House on a Rock", "average", "unusual, architecture", 2));
            allActivities.add(new Activity(500, "Isle Royal", "high", "National parks", 2));
            allActivities.add(new Activity(601, "Helicopter over grand canyon", "high", "National parks", 3));
            allActivities.add(new Activity(603, "Grand Canyon Lipan Point", "cheap", "National parks", 2));
            allActivities.add(new Activity(58, "National Zoo", "cheap", "Zoos", 2));
            allActivities.add(new Activity(4000, "The Hermitage", "average", "Museums", 2));
            allActivities.add(new Activity(650, "Skydiving", "high", "unusual, thrill-seeking", 2));
            allActivities.add(new Activity(500, "Zip line", "average", "thrill-seeking", 2));
            allActivities.add(new Activity(603, "Flyboi and Lil Mama", "cheap", "unusual, murals", 2));



            //All hotels, feel free to add more
            allActivities.add(new Hotel(10, "The Greenbrair", "high", "unusual, military"));
            allActivities.add(new Hotel(200, "Motel 6", "cheap", ""));
            allActivities.add(new Hotel(300, "Four Seasons, New York", "high", "unusual, architecture"));
            allActivities.add(new Hotel(600, "The Langham Chicago", "high", "architecture"));
            allActivities.add(new Hotel(2006, "Ceasars Palace", "average", "unusual, gambling"));
            allActivities.add(new Hotel(2007, "Exaclibur Hotel", "average", "unusual, medieval, gambling"));
            allActivities.add(new Hotel(1005, "Greysone Castle Hilton", "average", "unusual"));
            allActivities.add(new Hotel(405, "Molly Pitcher Inn", "average", "unusual, historical"));

            //sorts by mile in ascending order
            Collections.sort(allActivities);



            //change group to get different results, or uncomment test cases I've made
            Group group = new Group("cheap", 20, "free-wheeling");
            //Group group = new Group("average", 20, "unusual");
            //Group group = new Group("high", 1, "unusual");
            //Group group = new Group("average", 20, "architecture");
            //Group group = new Group("high", 20, "thrill-seeking");
            //Group group = new Group("cheap", 20, "unusual, military");



            Trip trip = new Trip(group, allActivities);
            trip.addActivities();
            System.out.println(trip.toString());

    }
}
