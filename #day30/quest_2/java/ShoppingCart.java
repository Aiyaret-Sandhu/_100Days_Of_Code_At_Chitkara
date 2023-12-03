import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {
	private Map<String, Item> cart;

	public ShoppingCart() {
		this.cart = new HashMap<>();
	}

	public void add(String product, int price) {

        if (cart.keySet().contains(product)) {

            this.cart.get(product).increaseQuantity();

        } else {

            cart.put(product, new Item(product, 1, price));
        }

    }
	public int price() {
		int total = 0;
		for (Item item : cart.values()) {
			total += item.price();
		}
		return total;
	}

	public void print() {
		for (Item item : cart.values()) {
			System.out.println(item.getProduct() + ": " + item.getQuantity());
		}
	}
}