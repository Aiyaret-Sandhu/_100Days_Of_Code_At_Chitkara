
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public Money plus(Money addition) {
        Money newMoney = new Money((this.euros + addition.euros()), (this.cents + addition.cents())); // create a new Money object that has the correct worth
    
        // return the new Money object
        return newMoney;
    }

    public boolean lessThan(Money compared) {
        if(this.euros > compared.euros()) {
            return false;
        } else if (this.euros < compared.euros()){
            return true;
        } else {
            if(this.cents < compared.cents()){
                return true;
            }
            return false;
        }
    }

    public Money minus(Money decreaser) {
        int euros = this.euros;
        int cents = this.cents;

        if ((euros + 0.01*cents) - (decreaser.euros() + 0.01*cents()) < 0) {
            return new Money(0, 0);
        } else {
            int neweuro = euros - decreaser.euros();
            int newcents = cents - decreaser.cents();
            if (cents-decreaser.cents < 0) {
                neweuro--;
                newcents += 100;
            }
            return new Money(neweuro, newcents);
            }
        }
    

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

}
