import java.util.ArrayList;

public class Suitcase {
    private ArrayList<Item> items;
    private final int maxWeight;

    public Suitcase(int weight) {
        this.items = new ArrayList<>();
        this.maxWeight = weight;
    }

    public int totalWeight() {
        if (items.size() == 0) {
            return 0;
        } else {
            int sum = 0;
            for (Item item : items) {
                sum += item.getWeight();
            }
            return sum;
        }
    }

    public void addItem(Item item) {
        if ((totalWeight() + item.getWeight()) <= maxWeight) {
            items.add(item);
        }
    }

    public void printItems() {
        for(Item item : items) {
            System.out.println(item.getName() + " (" + item.getWeight() + " kg)");
        }
    }

    public String toString() {
        if (items.size() == 0) {
            return "no items (0 kg)";
        } else if (items.size() == 1) {
            return "1 item (" + totalWeight() + " kg)";
        }
        return items.size() + " items (" + totalWeight() + " kg)";
    }

    public Item heaviestItem() {
        if (this.items.size() == 0) {
            return null;
        }

        Item heaviestItem = this.items.get(0);
        for(Item item : this.items) {
            if(item.getWeight() > heaviestItem.getWeight()) {
                heaviestItem = item;
            }
        }
        return heaviestItem;
    }
            
}
