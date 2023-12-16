public class Pipe<T> {

    private T idk;

    public Pipe() {
        
    }

    public void putIntoPipe(T value) {
        this.idk = value;
    }

    public T takeFromPipe() {
        if (this.idk == null) {
            return null;
        }

        T val = this.idk;
        this.idk = null;
        return val;
    }

    public boolean isInPipe() {
        return !(this.idk == null);
    }
}
