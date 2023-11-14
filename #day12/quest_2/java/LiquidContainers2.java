
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container first = new Container();
        Container second = new Container();

        while (true) {
            System.out.println("First: " + first.toString());
            System.out.println("Second: " + second.toString());

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }

            String[] inp = input.split(" ");
            String command = inp[0];
            int amount = Integer.valueOf(inp[1]);

            

            switch (command) {
                case "add":
                    first.add(amount);
                    break;
                
                case "move":
                    if (first.contains() >= amount) {
                        second.add(amount);
                        first.remove(amount);
                    } else  {
                        int temp = first.contains();
                        second.add(temp);
                        first.remove(temp);
                    }           
                    break;
                case "remove" :
                    second.remove(amount);
                    break;
                
                default :
                    System.out.println("Unknown command");

            }

            System.out.println();

        }
    }

}
