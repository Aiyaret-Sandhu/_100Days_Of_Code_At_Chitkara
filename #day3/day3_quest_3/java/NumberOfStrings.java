
import java.util.Scanner;

public class NumberOfStrings {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;

        while (true) {
            String inp = scanner.nextLine();
            if (inp.equals("end")) {
                System.out.println(count);
                break;
            } else {
                count++;
            }
        }
    }
}
