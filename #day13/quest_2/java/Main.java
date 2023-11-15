
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Write your program here -- consider breaking the program into 
        // multiple classes.
        Points points = new Points();
        points.start();
        System.out.println("Point average (all): " + points.pointAverage());
        System.out.println("Point average (passing): " + points.passingAvg(50));
        System.out.println("Pass percentage: " + points.passPercent());
        points.printGradeDistribution();
    }
}
