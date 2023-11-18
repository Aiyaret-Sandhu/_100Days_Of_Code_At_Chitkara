import java.util.HashMap;

public class Abbreviations {
    private HashMap<String, String> map ;

    public Abbreviations() {
        this.map = new HashMap<>();
    }

    public void addAbbreviation(String abbreviation, String explanation){
        String input = sanitizedString(abbreviation);
        if (!(hasAbbreviation(input))){
            this.map.put(input, explanation);
        }
    }

    public boolean hasAbbreviation(String abbreviation) {
        if (this.map.containsKey(sanitizedString(abbreviation))) {
            return true;
        } else {
            return false;
        }
    }

    public String findExplanationFor(String abbreviation) {
        if (hasAbbreviation(abbreviation)) {
            return this.map.get(sanitizedString(abbreviation));
        } else {
            return null;
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
