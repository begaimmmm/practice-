import java.util.ArrayList;

public class film {
    public static void main(String[] args) {

        ArrayList<String> movies = new ArrayList<>();
        movies.add("Avatar");
        movies.add("Titanic");
        movies.add("Inception");

        String first = "";
        String second = "";

        for (String m : movies) {
            if (m.length() > first.length()) {
                second = first;
                first = m;
            } else if (m.length() > second.length()) {
                second = m;
            }
        }

        System.out.println("Второе по длине: " + second);
    }
}
