import java.util.ArrayList;

public class Box implements Packable{
    private double maxCapacity;
    private ArrayList<Packable> items;

    public Box(double capacity) {
        this.maxCapacity = capacity;
        this.items = new ArrayList<>();
    }

    public double weight() {
        double weight = 0;
        for (Packable item : this.items) {
            weight += item.weight();
        }
        return weight;
    }

    // @Override
    public void add(Packable item) {
        if (item.weight()<= this.maxCapacity) {
            this.items.add(item);
            this.maxCapacity -= item.weight();
        }
    }

    @Override
    public String toString() {
        return "Box: " + this.items.size() + " items, total weight " + weight() + " kg";
    }
}
