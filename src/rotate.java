import java.util.ArrayList;

public class rotate {
    public static void main(String[] args) {

        ArrayList<String> days = new ArrayList<>();
        days.add("Mon");
        days.add("Tue");
        days.add("Wed");
        days.add("Thu");
        days.add("Fri");

        for (int i = 0; i < 2; i++) {
            String last = days.remove(days.size() - 1);
            days.add(0, last);
        }

        System.out.println(days);
    }
}


