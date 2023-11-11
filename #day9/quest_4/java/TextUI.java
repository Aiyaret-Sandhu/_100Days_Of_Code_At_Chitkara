import java.util.Scanner;

public class TextUI {
    private Scanner scanner;
    private SimpleDictionary object;

    public TextUI(Scanner scanner, SimpleDictionary dict) {
        this.object = dict;
        this.scanner = scanner;
    }

    public void start() {
        while(true) {
            System.out.print("Command: ");

            String input = scanner.nextLine();

            if (input.equals("end")) {
                System.out.println("Bye bye!");
                break;

            } else if (input.equals("search")) {
                System.out.print("To be translated: ");
                String word = scanner.nextLine();

                if (object.translate(word) == null ){
                    System.out.println("Word " + word + " was not found");
                } else {               
                    System.out.println("Translation: " + object.translate(word));
                }

            }else if (input.equals("add")) {
                System.out.print("Word: ");
                String word = scanner.nextLine();
                System.out.println("Translation: ");
                String translation = scanner.nextLine();

                object.add(word, translation);

            }else {
                System.out.println("Unknown command");
            }
        }
    }
}
