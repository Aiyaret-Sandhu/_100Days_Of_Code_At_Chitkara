package application;

public class StandardSensor implements Sensor {

    private int value;

    public StandardSensor(int value) {
        this.value = value;
    }
    
    public boolean isOn() {
        return true;
    }

    public int read() {
        return this.value;
    }

    public void setOn() {

    }

    public void setOff() {

    }
}
