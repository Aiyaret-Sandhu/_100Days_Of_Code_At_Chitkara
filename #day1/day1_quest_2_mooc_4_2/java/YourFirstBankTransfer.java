
public class YourFirstBankTransfer {

    public static void main(String[] args) {
        // Do not touch the code in Account.java
        // write your program here
        Account methew = new Account("Matthews account", 1000.0);
        Account myaccount = new Account("My account", 0);
        methew.withdrawal(100.0);
        myaccount.deposit(100.0);
        System.out.println(methew);
        System.out.println(myaccount);
        
    }
}
