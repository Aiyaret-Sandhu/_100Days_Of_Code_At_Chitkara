
import java.util.HashMap;

public class Program {

    public static void main(String[] args) {
        // Test your program here!
    }

    
    public static void printKeys(HashMap<String,String> hashmap) {
        for (String i : hashmap.keySet()) {
            System.out.println(i);
        }
    }

    public static void printKeysWhere(HashMap<String,String> hashmap, String text) {
        text = sanitizedString(text);

        for (String req : hashmap.keySet()){
            if (!(req.contains(text))){
                continue;
            }

            System.out.println(req);
        }
    }

    public static void printValuesOfKeysWhere(HashMap<String,String> hashmap, String text) {
        text = sanitizedString(text);

        for (String req : hashmap.keySet()){
            if (!(req.contains(text))){
                continue;
            }

            System.out.println(hashmap.get(req));
        }

    }

    public static String sanitizedString(String name) {
        if (name == null) {
            name = "";
        }
        name = name.toLowerCase();
        return name.trim();
    }

}
