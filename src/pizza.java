import java.util.ArrayList;

    public class pizza {
        public static void main(String[] args) {

            ArrayList<String> foods = new ArrayList<>();
            foods.add("Pizza");
            foods.add("Burger");
            foods.add("Pizza");

            int count = 0;

            for (String food : foods) {
                if (food.equals("Pizza")) {
                    count++;
                }
            }

            System.out.println("Pizza встречается: " + count + " раз");
        }
    }

