public class Cube {
    private int edge;

    public Cube(int edgeLength) {
        this.edge = edgeLength;
    }

    public int volume() {
        return (int)(Math.pow(edge, 3));
    }

    public String toString() {
        return "The length of the edge is " + this.edge + " and volume " + volume();
    }
}
