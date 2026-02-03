import java.util.ArrayList;

public class NullValues {
    public static void main(String[] args) {

        ArrayList<String> students = new ArrayList<>();
        students.add("Ivan");
        students.add(null);
        students.add("Anna");

        for (int i = 0; i < students.size(); i++) {
            if (students.get(i) == null) {
                students.remove(i);
                i--;
            }
        }

        System.out.println(students);
    }
}


