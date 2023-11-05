import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        // implement here the program that allows the user to enter 
        // book information and to examine them
        Scanner helos = new Scanner(System.in);
        ArrayList<Books> list = new ArrayList<>();

        while (true) {
            System.out.print("Title: ");
            String title = helos.nextLine();
            if(title.isEmpty()) {
                break;
            } else {
                System.out.print("Pages: ");
                int pages = Integer.valueOf(helos.nextLine());
                System.out.print("Publication year: ");
                int year = Integer.valueOf(helos.nextLine());
                list.add(new Books(title, pages, year));
            }
        }

        System.out.print("What information will be printed? ");
        String inp = helos.nextLine();

        if (inp.equals("everything")) {
            for (Books book : list) {
                System.out.println(book.toString());
            }    
        } else if (inp.equals("name")) {
            for (Books book : list) {
                System.out.println(book.getname());
            }
        }
    }
}
