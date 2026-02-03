import java.util.ArrayList;

public class numbers {
    public static void main(String[] args) {

        int[] numbers = {1, 2, 3};

        ArrayList<Integer> list = new ArrayList<>();
        for (int num : numbers) {
            list.add(num);
        }

        System.out.println(list);
    }
}

