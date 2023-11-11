import java.util.Scanner;

public class UserInterface {
    private Scanner scan;
    private TodoList tasks;

    public UserInterface(TodoList task , Scanner helos) {
        this.scan = helos;
        this.tasks = task;
    }

    public void start() {
        while(true) {
            System.out.print("Command: ");
            String command = this.scan.nextLine();

            if (command.equals("stop")) {
                break;
            } else if (command.equals("add")) {
                System.out.print("To add: ");
                String toAdd = this.scan.nextLine();
                this.tasks.add(toAdd);
            } else if (command.equals("list")) {
                this.tasks.print();
            } else if (command.equals("remove")) {
                System.out.print("Which one is removed? ");
                int indx = Integer.valueOf(this.scan.nextLine());
                this.tasks.remove(indx);
            } else {
                System.out.println("Unknown command");
            }
        }
    }
}
