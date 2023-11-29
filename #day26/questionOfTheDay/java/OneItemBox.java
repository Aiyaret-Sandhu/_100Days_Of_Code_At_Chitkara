import java.util.ArrayList;

public class OneItemBox extends Box {
    private int count;
    private ArrayList<Item> items;

    public OneItemBox() {
        this.count = 0;
        this.items = new ArrayList<>();
    }

    public void add(Item item) {
        if (count == 0) {
            this.items.add(item);
            count = 1;
        }
    }

    public boolean isInBox(Item item) {
        return this.items.contains(item);
    }
}
