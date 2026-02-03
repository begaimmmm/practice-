import java.util.ArrayList;

public class country {
    public static void main(String[] args) {

        ArrayList<String> countries1 = new ArrayList<>();
        countries1.add("USA");
        countries1.add("France");
        countries1.add("Russia");
        countries1.add("Germany");

        ArrayList<String> countries2 = new ArrayList<>();
        countries2.add("France");
        countries2.add("Italy");
        countries2.add("Germany");
        countries1.add("Kyrgyzstan");

        ArrayList<String> common = new ArrayList<>();

        for (String c : countries1) {
            if (countries2.contains(c)) {
                common.add(c);
            }
        }

        System.out.println(common);
    }
}

