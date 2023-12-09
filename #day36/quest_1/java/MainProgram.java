
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
import java.util.Collections;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Books> list = new ArrayList<>();

        while(true) {
            System.out.print("Input the name of the book, empty stops: ");
            String name = scanner.nextLine();

            if (name.isEmpty()) {
                break;
            } else {
                System.out.print("Input the age recommendation: ");
                int age = Integer.valueOf(scanner.nextLine());
                list.add(new Books(name, age));
            }

            System.out.println(list.size() + " books in total.");

            System.out.println("Books:");

            Comparator<Books> comparator = Comparator.comparing(Books :: getAge).thenComparing(Books :: getName);

            Collections.sort(list, comparator);

            for(Books book : list) {
                System.out.println(book.toString());
            }
        }
    }

}
