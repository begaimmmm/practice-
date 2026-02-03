import java.util.ArrayList;

    public class second {
        public static void main(String[] args) {

            ArrayList<String> movies = new ArrayList<>();
            movies.add("Avatar");
            movies.add("Titanic");
            movies.add("The Lord of the Rings");

            String longest = movies.get(0);

            for (String movie : movies) {
                if (movie.length() > longest.length()) {
                    longest = movie;
                }
            }

            System.out.println("Самое длинное название: " + longest);
        }
    }

