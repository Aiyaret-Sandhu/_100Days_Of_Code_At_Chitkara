import java.util.HashMap;

public class IOU {
    private HashMap<String, Double> persons;

    public IOU() {
        persons = new HashMap<>();
    }

    public void setSum(String toWhom, double amount) {
        this.persons.put(toWhom, amount);
    }

    public double howMuchDoIOweTo(String toWhom) {
        return this.persons.getOrDefault(toWhom, 0.0);
    }
}
