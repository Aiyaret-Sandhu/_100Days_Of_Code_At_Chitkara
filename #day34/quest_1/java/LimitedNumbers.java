
import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

public class LimitedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        while(true) {
            int number = Integer.valueOf(scanner.nextLine());
            if (number < 0) {
                break;
            } else {
                list.add(number);
            }
        }

        list.stream().filter(s -> ((s >= 1) && (s <= 5))).forEach(name -> System.out.println(name));

    }

}
