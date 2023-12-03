import java.lang.Math;

public class Organism implements Movable {
    private int xval;
    private int yval;

    public Organism(int x, int y){
        this.xval = x;
        this.yval = y;
    }

    @Override
    public String toString(){
        return "x: " + this.xval + "; y: " + this.yval;
    }

    public void move(int dx, int dy) {
        if (dx < 0) {
            this.xval -= Math.abs(dx);
        } else {
            this.xval += dx;
        }

        if (dy < 0) {
            this.yval -= Math.abs(dy);
        } else {
            this.yval += dy;
        }
    }
}
