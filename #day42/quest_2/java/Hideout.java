public class Hideout<T> {
    private T hide;

    public Hideout() {
        
    }

    public void putIntoHideout(T toHide) {
        this.hide = toHide;
    }

    public T takeFromHideout() {
        if (this.hide == null) {
            return null;
        } else {
            T taken = this.hide;
            this.hide = null;
            return taken;
        }
    }

    public boolean isInHideout() {
        if (this.hide == null) {
            return false;
        } else {
            return true;
        }
    }

}
