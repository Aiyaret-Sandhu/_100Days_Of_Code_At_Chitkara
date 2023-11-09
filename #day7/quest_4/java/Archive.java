public class Archive {
    private String id;
    private String name;

    public Archive(String a, String b) {
        this.id = a;
        this.name = b;
    } 

    public String toString() {
        return this.id + ": " + this.name;
    }

    public boolean equals(Object compared) {
        if (this == compared) {
            return true;
        }

        if (!(compared instanceof Archive)) {
            return false;
        }

        Archive newcomp = (Archive) compared;
        return this.id.equals(newcomp.id);
    }
}
