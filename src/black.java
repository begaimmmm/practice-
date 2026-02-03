import java.util.ArrayList;

    public class black {
        public static void main(String[] args) {

            ArrayList<String> colors = new ArrayList<>();
            colors.add("Red");
            colors.add("Blue");

            for (int i = 0; i < colors.size(); i++) {
                colors.set(i, "Black");
            }

            System.out.println(colors);
        }
    }

