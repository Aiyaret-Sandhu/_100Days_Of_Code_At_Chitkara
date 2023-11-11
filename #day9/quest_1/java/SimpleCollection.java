
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }

    public String longest() {
        if (this.elements.size() == 0) {
            // System.out.print("Longest: ");
            return null;
        }

        String longest = "";
        for(String str : this.elements) {
            if (str.length() > longest.length()) {
                longest = str;
            }
        }
        // System.out.print("Longest: ");
        return longest;
    }

}
