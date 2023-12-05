
import java.util.ArrayList;
import java.util.Scanner;

public class PrintingUserInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();

        while(true) {
            String inp = scanner.nextLine();

            if (inp.isEmpty()) {
                break;
            } else {
                list.add(inp);
            }
        }

        String combined = list.stream().reduce("", (previous, word) -> previous + word + "\n");

        System.out.println(combined);

    }
}
