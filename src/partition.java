import java.util.ArrayList;

public class partition {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);

        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();

        for (int n : numbers) {
            if (n % 2 == 0) {
                even.add(n);
            } else {
                odd.add(n);
            }
        }

        System.out.println("Чётные: " + even);
        System.out.println("Нечётные: " + odd);
    }
}


