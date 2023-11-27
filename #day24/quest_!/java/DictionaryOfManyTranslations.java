import java.util.ArrayList;
import java.util.HashMap;

public class DictionaryOfManyTranslations {
    private HashMap<String, ArrayList<String>> dictMap;

    public DictionaryOfManyTranslations(){
        dictMap = new HashMap<>();
    }

    public void add(String word, String translation) {
        if (this.dictMap.containsKey(word)) {
            this.dictMap.get(word).add(translation);
        } else {
            this.dictMap.put(word , new ArrayList<>());
            this.dictMap.get(word).add(translation);
        }
    }

    public ArrayList<String> translate(String word) {
        ArrayList<String> item = this.dictMap.get(word);

        if (item == null) {
            ArrayList<String> empty = new ArrayList<>();
            return empty;
        } else {
            return this.dictMap.get(word);
        }
    }

    public void remove(String word) {
        this.dictMap.remove(word);
    }
}
