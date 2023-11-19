
import java.util.HashMap;

public class Program {

    public static void main(String[] args) {
        // Test your program here!

    }

    public static void printValues(HashMap<String,Book> hashmap){
        for(Book book : hashmap.values()) {
            System.out.println(book.toString());
        }
    }

    public static void printValueIfNameContains(HashMap<String,Book> hashmap, String text){
        text = sanitizedString(text);

        for (Book books : hashmap.values()) {
            if(books.getName().contains(text)) {
                System.out.println(books.toString());
            }
        }
    }

    public static String sanitizedString(String text) {
        if (text == null) {
            return "";
        }
        text = text.toLowerCase();
        return text.trim();
    }

}
