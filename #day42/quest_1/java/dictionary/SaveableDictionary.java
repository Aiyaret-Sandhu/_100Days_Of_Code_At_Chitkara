package dictionary;

import java.util.HashMap;
import java.io.File;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.Scanner;

public class SaveableDictionary {
    private HashMap<String , String> map;
    private File file;

    public SaveableDictionary() {
        this.map = new HashMap<>();
    }

    public SaveableDictionary(String file) {
        this.map = new HashMap<>();
        this.file = new File(file);
    }

    public boolean load() {
        try {
            Scanner fileReader = new Scanner(Paths.get(this.file.getName()));
            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine();
                String[] arr = line.split(":");
                add(arr[0], arr[1]);
            }
            return true;

        } catch (Exception e) {
            System.out.println("File load error: " + e.getMessage());
            return false;
        }
    }

    public boolean save(){
        try {
            PrintWriter pw = new PrintWriter(this.file.getName());
            for(String s : this.map.keySet()) {
                String word = s;
                String translation = this.map.get(s);
                pw.println(word + ":" + translation);
            }
            pw.close(); 
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    public void add(String words, String translation){
        this.map.putIfAbsent(words, translation);
    }

    public String translate(String word) {
        for (String item : this.map.keySet()) {
            if (this.map.get(item).equals(word)){
                return item;
            } else if (this.map.get(word) != null) {
                return this.map.get(word);
            }
        }
        return null;
    }

    public void delete(String word){
        String itemToRemove = "";
        for(String item : this.map.keySet()) {
            if(this.map.get(item).equals(word)){
                itemToRemove = item;
            } else if (this.map.get(word) != null) {
                itemToRemove = word;
            }
        }
        this.map.remove(itemToRemove);
    }

}
