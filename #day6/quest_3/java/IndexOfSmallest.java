
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // implement here a program that reads user input
        // until the user enters 9999
        
        // after that, the program prints the smallest number
        // and its index -- the smallest number
        // might appear multiple times
        ArrayList<Integer> list = new ArrayList<>();

        while (true) {
            int num = Integer.valueOf(scanner.nextLine());
            if (num == 9999) {
                break;
            } else {
                list.add(num);
            }
        }

        int smallest = list.get(0);
        int foundIndex = 0;

        for (int i = 1 ; i < list.size() ; i++) {
            if (list.get(i) < smallest) {
                smallest = list.get(i);
                foundIndex = i;
            }
        }

        System.out.print("Smallest number: " + smallest);
        System.out.println("Found at index: " + foundIndex);
        
    }
}
