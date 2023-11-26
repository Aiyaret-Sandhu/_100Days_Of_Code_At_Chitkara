
import java.util.Objects;
// import java.util.HashMap;

public class LicensePlate {
    // don't modify existing parts of this class

    // these instance variables have been defined as final, meaning 
    // that once set, their value can't be changed
    private final String liNumber;
    private final String country;

    public LicensePlate(String country, String liNumber) {
        this.liNumber = liNumber;
        this.country = country;
    }

    @Override
    public String toString() {
        return country + " " + liNumber;
    }

    public boolean equals(LicensePlate lis){
        if (this == lis) {
            return true;
        }
        if (!(lis instanceof LicensePlate)) {
            return false;
        }

        LicensePlate newlis = (LicensePlate) lis;

        if (this.liNumber.equals(newlis.liNumber) && this.country.equals(newlis.country)) {
            return true;
        }
        return false;
    }


    @Override
    public int hashCode() {
        int hash = 5;
        hash = hash*47 + Objects.hashCode(this.country);
        hash = hash*47 + Objects.hashCode(this.liNumber);
        return hash;
    }
    // @Override
    // public int hashCode() {
    //     int hash = 7;
    //     hash = 47 * hash + Objects.hashCode(this.liNumber);
    //     hash = 47 * hash + Objects.hashCode(this.country);
    //     return hash;
    // }

}
