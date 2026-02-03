import java.util.ArrayList;

    public class cities {
        public static void main(String[] args) {

            ArrayList<String> cities = new ArrayList<>();
            cities.add("Bishkek");
            cities.add("Talas");

            String[] array = cities.toArray(new String[0]);

            for (String city : array) {
                System.out.println(city);
            }
        }
    }

