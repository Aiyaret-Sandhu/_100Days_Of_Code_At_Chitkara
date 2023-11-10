
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

    public String toString() {
        String outline = "";
        String eles = "";

        for (String i : this.elements) {
            if (i.equals(this.elements.get(this.elements.size() -1))){
                eles += i;
            } else {
                eles += i + "\n";
            }
        }

        if (this.elements.size() == 0) {
            outline =  "The collection " + this.name + " is empty.";
        } else if (this.elements.size() == 1) {
            outline =  "The collection " + this.name + " has 1 element:\n" + eles;
        } else {
            outline =  "The collection " + this.name + " has " + this.elements.size() + " elements:\n" + eles;
        }

        return outline;
    }
    
}
