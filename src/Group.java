import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Group {
    String extravagance;
    int size;
    Set<String> type;

    public Group(String extravagance, int size, String type){
        this.extravagance = extravagance;
        this.size = size;
        this.type = new HashSet<>(Arrays.asList(type.split(", ")));

    }

}
