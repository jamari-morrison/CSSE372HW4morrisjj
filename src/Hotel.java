import java.util.Arrays;
import java.util.HashSet;

public class Hotel extends ActivityInterface {

    public Hotel(int mile, String name, String cost, String themes){
            this.cost = cost;
            this.name = name;
            this.mile = mile;
            this.themes = new HashSet<>(Arrays.asList(themes.split(", ")));
    }
    @Override
    String getType() {
        return "hotel";
    }
}
