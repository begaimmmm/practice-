import java.util.ArrayList;

public class nested {
    public static void main(String[] args) {

        ArrayList<ArrayList<String>> departments = new ArrayList<>();

        ArrayList<String> it = new ArrayList<>();
        it.add("Alice");
        it.add("Bob");

        ArrayList<String> hr = new ArrayList<>();
        hr.add("Emma");
        hr.add("John");

        departments.add(it);
        departments.add(hr);

        for (ArrayList<String> dept : departments) {
            System.out.println(dept);
        }
    }
}

