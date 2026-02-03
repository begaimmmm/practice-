import java.util.ArrayList;

public class song {
    public static void main(String[] args) {

        ArrayList<String> songs = new ArrayList<>();
        songs.add("Hello");
        songs.add("Sky");
        songs.add("Beautiful Day");

        String shortest = songs.get(0);

        for (String song : songs) {
            if (song.length() < shortest.length()) {
                shortest = song;
            }
        }

        System.out.println("Самая короткая строка: " + shortest);
    }
}

