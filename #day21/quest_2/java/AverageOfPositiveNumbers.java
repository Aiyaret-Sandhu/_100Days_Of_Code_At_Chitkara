
import java.util.Scanner;
import java.util.ArrayList;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> nums = new ArrayList<>();
        int sum = 0 ;

        while(true) {
            int num = Integer.valueOf(scanner.nextLine()) ;
            if (num == 0) {
                break;
            } else if ( num > 0) {
                nums.add(num);
                sum += num;
            }
        }

        if (nums.size() == 0) {
            System.out.println("Cannot calculate the average");
        } else {
            System.out.println(1.0 * sum / nums.size());
        }
    }
}
