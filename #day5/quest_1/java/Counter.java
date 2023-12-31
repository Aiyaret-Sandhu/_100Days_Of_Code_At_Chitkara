public class Counter {
    private int num;

    public Counter(int startValue) {
        this.num = startValue;
    }

    public Counter() {
        this(0);
    } 

    public int value() {
        return this.num;
    }

    public void increase() {
        this.increase(1);
    }

    public void decrease() {
        this.decrease(1);
    }

    public void increase(int increaseBy) {
        if (increaseBy > 0) {
            this.num = this.num + increaseBy;
        }
    }

    public void decrease(int decreaseBy) {
        if (decreaseBy > 0) {
            this.num = this.num - decreaseBy;
        }
    }
}
