import java.util.ArrayList;

public class names {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        names.add("Anna");
        names.add("Bob");
        names.add("Alex");

        for (int i = 0; i < names.size(); i++) {
            if (names.get(i).length() % 2 == 0) {
                names.remove(i);
                i--; // чтобы не пропустить элемент
            }
        }

        System.out.println(names);
    }
}

