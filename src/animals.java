import java.util.ArrayList;

public class animals {
    public static void main(String[] args) {

        ArrayList<String> animals = new ArrayList<>();
        animals.add("Cat");
        animals.add("Dog");
        animals.add("Cat");

        ArrayList<String> unique = new ArrayList<>();

        for (String animal : animals) {
            if (!unique.contains(animal)) {
                unique.add(animal);
            }
        }

        System.out.println(unique);
    }
}


