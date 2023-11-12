import java.util.Scanner;

public class UserInterface {
    private JokeManager jokes;
    private Scanner scanner;

    public UserInterface(JokeManager jokes, Scanner scanner) {
        this.scanner = scanner;
        this.jokes = jokes;
    }

    public void start() {
        while (true) {
            System.out.println("Commands:\n1 - add a joke\n2 - draw a joke\n3 - list jokes\nX - stop");
        String input = scanner.nextLine();

        if (input.equals("1")) {
            addJoke();

        } else if (input.equals("X")) {
            break;

        } else if (input.equals("3")) {
            this.jokes.printJokes();
            continue;

        } else if (input.equals("2")) {
            System.out.println(this.jokes.drawJoke());
            continue;
        } else {
            System.out.println("Invalid Command");
            continue;
        }
        }
    }

    public void addJoke() {
        System.out.println("Write the joke to be added:");
        String joke = scanner.nextLine();
        this.jokes.addJoke(joke);
    } 
}
