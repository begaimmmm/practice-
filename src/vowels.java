
import java.util.ArrayList;

public class vowels {
    public static void main(String[] args) {

        ArrayList<String> words = new ArrayList<>();
        words.add("apple");
        words.add("orange");

        for (int i = 0; i < words.size(); i++) {
            String w = words.get(i);
            w = w.replaceAll("[aeiouAEIOU]", "*");
            words.set(i, w);
        }

        System.out.println(words);
    }
}




