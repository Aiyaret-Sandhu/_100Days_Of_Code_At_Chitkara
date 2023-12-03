import java.util.ArrayList;

public class Herd implements Movable {
    private ArrayList<Movable> list;

    public Herd() {
        this.list = new ArrayList<>();
    }

    public void addToHerd(Movable movable) {
        this.list.add(movable);
    }

    public void move(int dx, int dy) {
        for (Movable obj : this.list) {
            obj.move(dx, dy);
        }
    }


    @Override
    public String toString(){
        String val = "";
        for (Movable obj : this.list) {
            val += obj.toString();
            val += "\n";
        }
        return val;
    }

}
