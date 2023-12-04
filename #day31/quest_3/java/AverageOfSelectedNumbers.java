
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // toteuta ohjelmasi tänne
        System.out.println("Input numbers, type \"end\" to stop.");
        ArrayList<String> list = new ArrayList<>();

        while(true) {
            String input = scanner.nextLine();
            if (input.equals("end")){
                break;
            } else {
                list.add(input);
            }
        }

        System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");
        String value = scanner.next();
        double average = 0.0;
        if (value.equals("n")) {
            average = list.stream().mapToInt(s -> Integer.valueOf(s)).filter(s -> s < 0).average().getAsDouble();
        } else if (value.equals("p")) {
            average = list.stream().mapToInt(s -> Integer.valueOf(s)).filter(s -> s > 0).average().getAsDouble();
        }

        System.out.println("average of the numbers: " + average);

    }
}
