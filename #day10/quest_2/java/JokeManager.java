import java.util.Random;
import java.util.ArrayList;

public class JokeManager {
    private ArrayList<String> jokes;

    public JokeManager() {
        this.jokes = new ArrayList<>();
    }

    public void addJoke(String joke) {
        this.jokes.add(joke);
    }

    public String drawJoke() {
        if (this.jokes.isEmpty()) {
            return "Jokes are in short supply.";
        }
        Random draw = new Random();

        int randomIndex = draw.nextInt(jokes.size()); //random index from 0 to jokes length/size

        return jokes.get(randomIndex);
    }

    public void printJokes() {
        for (String joke : this.jokes) {
            System.out.println(joke);
        }
    }


}
