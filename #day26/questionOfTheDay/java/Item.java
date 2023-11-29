import java.util.Objects;

public class Item {

    private String name;
    private int weight;

    public Item(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public Item(String name) {
        this(name, 0);
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }
    @Override
    public boolean equals(Object item){
        if (this == item) {
            return true;
        }

        if (!(item instanceof Item)){
            return false;
        }

        Item nitem = (Item) item;
        if (this.name.equals(nitem.name)) {
            return true;
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        int hashCode = 7;
        hashCode = 49*hashCode + Objects.hash(this.name);
        return hashCode;
    }

}
