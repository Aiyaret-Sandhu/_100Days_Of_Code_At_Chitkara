import java.util.ArrayList;
import java.util.Scanner;

public class Points {
    private ArrayList<Integer> points;
    private Scanner scanner;
    private ArrayList<Integer> grades;

    public Points() {
        points = new ArrayList<>();
        scanner = new Scanner(System.in);
        grades = new ArrayList<>();
    }

    public void printGradeDistribution() {

        int[] gradeDistArr = new int[6]; 
        for (int grade : this.points) {

            if (grade >= 90) {
                gradeDistArr[0]++;

            } else if (grade <= 89 && grade > 79) {
                gradeDistArr[1]++;
            } else if (grade <= 79 && grade > 69) {
                gradeDistArr[2]++;
            } else if (grade <= 69 && grade > 59) {
                gradeDistArr[3]++;
            } else if (grade <= 59 && grade > 49) {
                gradeDistArr[4]++;
            } else if (grade <= 49) {
                gradeDistArr[5]++;
            }

        }
        System.out.println("Grade distribution:");
        int gradDistIndex = 5;

        for (int e : gradeDistArr) {
            System.out.print(gradDistIndex + ":");

            for (int i = 0; i < e; i++) {
                System.out.print("*");
            }

            System.out.print("\n"); //line break
            gradDistIndex--;
        }

    }

    public void start() {
        System.out.println("Enter point totals, -1 stops:");
        while(true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1){
                break;
            } else if (input >= 0 && input <= 100) {
                this.points.add(input);
                this.grades.add(getGrade(input));
            }
        }
    }

    public int getGrade(int input) {
        if (input >= 90) {
            return 5;
        } else if (input < 90) {
            return 4;
        } else if (input < 80) {
            return 3;
        } else if (input < 70) {
            return 2;
        } else if (input < 60) {
            return 1;
        } else {
            return 0;
        }
    }

    public double pointSum() {
        if (this.points.size() > 0) {
            double sum = 0;
            for (int i = 0 ; i < this.points.size() ; i++) {
                sum += this.points.get(i);
            }
            return sum;
        } else {
            return 0;
        }
    }

    public double pointAverage() {
        return pointSum() / this.points.size();
    }

    public double passingAvg(int req) {
        if (this.points.size() > 0) {
            double sum = 0;
            int count = 0;
            for (int i = 0 ; i < this.points.size() ; i++) {
                if (this.points.get(i) >= req){
                    sum += this.points.get(i);
                    count++;
                }
            }
            return sum/count;
        } else {
            return 0;
        }
    }

    public double passPercent() {
        if (this.points.size() > 0) {
            int count = 0;
            for (int i : points) {
                if (i >= 50) {
                    count++;
                }
            }
            return (((double)count)*100)/((double)points.size());
        } else {
            return 0.0;
        }
    }

    public void printStars() {
        System.out.print("*");
    }

    public void printGrades(int grade) {
        for (int i = 0 ; i < this.grades.size() ; i++ ){
            if (this.grades.get(i) == grade) {
                printStars();
            }
        }
        System.out.println();
    }


    public void printAllGrades() {
        for (int i = 5 ; i < 0 ; i--) {
            System.out.print( i + ": ");
            printGrades(i);
        }
    }

}
