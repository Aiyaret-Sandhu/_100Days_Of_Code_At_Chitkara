public class Item {
    private String product;
    private int quantity;
    private int uprice;

    public Item(String product, int qty, int unitPrice){
        this.product = product;
        this.quantity = qty;
        this.uprice = unitPrice;
    }

    public int price() {
        return this.uprice * this.quantity;
    }

    public void increaseQuantity() {
        this.quantity++;
    }

    public String getProduct(){
        return this.product;
    }

    public int getQuantity() {
        return this.quantity;
    }

    @Override
    public String toString() {
        return this.product + ": " + this.quantity;
    }
}
