import java.util.Scanner;
// import java.lang.Integer;

public class UserInterface {
    private Container first;
    private Container second;
    private Scanner scanner;

    public UserInterface(Scanner scanner) {
        this.first = new Container();
        this.second = new Container();
        this.scanner = scanner;
    }

    public void start() {
        while(true) {
            System.out.println("First: " + this.first.toString() + "\nSecond: " + this.second.toString());

            String input = scanner.nextLine();
            if (input.equals("quit")) {
                break;
            }

            String[] parts = input.split(" ");

            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);

            switch(command) {
                case "add":
                    this.first.add(amount);
                    break;
                
                case "move":
                    int present = this.first.getAmount();
                    if (present >= amount) {
                        this.first.remove(amount);
                        this.second.add(amount);   
                    } else {
                        this.second.add(present);
                        this.first.remove(present);
                    }
                    
                    break;
                
                case "remove" :
                    this.second.remove(amount);
                    break;

                default :
                    System.out.println("Invalid Command");
                    break;
            }
        }
    }
}
