//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.ArrayList;

        public class Main {
            public static void main(String[] args) {

                ArrayList<String> books1 = new ArrayList<>();
                books1.add("Java");
                books1.add("Python");
                ArrayList<String> books2 = new ArrayList<>();
                books2.add("Java");
                books2.add("C++");

                books1.addAll(books2);




                //
                 //
                // убираем дубликаты
                ArrayList<String> uniqueBooks = new ArrayList<>();
                for (String book : books1) {
                    if (!uniqueBooks.contains(book)) {
                        uniqueBooks.add(book);
                    }
                }

                System.out.println(uniqueBooks);
            }
        }