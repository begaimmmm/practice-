import java.util.ArrayList;

public class rose{
    public static void main(String[] args) {

        ArrayList<String> flowers = new ArrayList<>();
        flowers.add("Rose");
        flowers.add("Tulip");
        flowers.add("Rose");

        System.out.println("First index:" + flowers.indexOf("Rose"));
        System.out.println("Last index: " + flowers.lastIndexOf("Rose"));
    }
}


