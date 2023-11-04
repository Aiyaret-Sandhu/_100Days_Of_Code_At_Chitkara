public class Statistics {
    private int count = 0;
    private int sum = 0;

    public Statistics() {
        // initialize the variables count and sum here
    }

    public void addNumber(int number) {
        // write code here
        this.count += 1;
        this.sum += number;
    }

    public int getCount() {
        // write code here
        return this.count;
    }

    public int sum() {
        // write code here
        return this.sum;
    }

    public double average() {
        // write code here
        if (count != 0) {
            return 1.0 * this.sum / this.count;
        } else {
            return 0;
        }
    }
}