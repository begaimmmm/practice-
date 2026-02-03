import java.util.ArrayList;

public class sport {
    public static void main(String[] args) {

        ArrayList<String> sports = new ArrayList<>();
        sports.add("Football");
        sports.add("Tennis");
        sports.add("Basketball");

        ArrayList<String> check = new ArrayList<>();
        check.add("Football");
        check.add("Tennis");

        System.out.println(sports.containsAll(check));
    }
}

