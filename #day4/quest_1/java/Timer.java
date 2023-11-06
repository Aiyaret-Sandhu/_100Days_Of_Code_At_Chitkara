import java.time.Clock;

public class Timer {
    private ClockHand hundreths;
    private ClockHand seconds;

    public Timer() {
        this.hundreths = new ClockHand(100);
        this.seconds = new ClockHand(60);
    }

    public void advance() {
        this.hundreths.advance();

        if (hundreths.value() == 0) {
            this.seconds.advance();
        }
    }

    public String toString() {
        return this.seconds + ":" + this.hundreths;
    }
}
