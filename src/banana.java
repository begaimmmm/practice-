import java.util.ArrayList;

    public class banana{
        public static void main(String[] args) {

            ArrayList<String> fruits = new ArrayList<>();
            fruits.add("Apple");
            fruits.add("Banana");
            fruits.add("Banana");

            fruits.removeIf(fruit -> fruit.equals("Banana"));

            System.out.println(fruits);
        }
    }

