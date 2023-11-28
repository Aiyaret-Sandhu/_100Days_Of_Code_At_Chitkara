import java.util.ArrayList;

public class ChangeHistory {
    private ArrayList<Double> changes;

    public ChangeHistory(){
        this.changes = new ArrayList<>();
    }

    public void add(double status) {
        this.changes.add(status);
    }

    public void clear() {
        this.changes.clear();
    }

    public String toString() {
        return changes.toString();
    }

    public double maxValue() {
        if (this.changes.size() == 0) {
            return 0.0;
        }
        double maxValue = this.changes.get(0);

        for(int i = 1 ; i < this.changes.size() ; i++) {
            if (maxValue < this.changes.get(i)) {
                maxValue = this.changes.get(i);
            }
        }
        return maxValue;
    }

    public double minValue() {
        if (this.changes.size() == 0) {
            return 0.0;
        }
        double mixValue = this.changes.get(0);

        for(int i = 1 ; i < this.changes.size() ; i++) {
            if (mixValue > this.changes.get(i)) {
                mixValue = this.changes.get(i);
            }
        }
        return mixValue;
    }

    public double average() {
        if (this.changes.size() == 0) {
            return 0.0;
        }
        double sum = 0.0;
        for (Double ele : this.changes){
            sum += ele;
        }

        return 1.0 * sum / this.changes.size();
    }
}
