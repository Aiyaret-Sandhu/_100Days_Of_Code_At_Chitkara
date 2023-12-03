import java.util.Map;
import java.util.Set;
import java.util.HashMap;
import java.util.HashSet;

public class Warehouse {
    private Map<String, Integer> wareStock;
    private Map<String, Integer> warePrice;

    public Warehouse() {
        this.wareStock = new HashMap<>();
        this.warePrice = new HashMap<>();
    }

    public void addProduct(String product, int price, int stock) {
        this.wareStock.put(product, stock);
        this.warePrice.put(product, price);
    }

    public int price(String product){
        if (this.warePrice.containsKey(product)) {
            return this.warePrice.get(product);
        } else {
            return -99;
        }
    }

    public int stock(String product) {
        if (this.wareStock.containsKey(product)) {
            return this.wareStock.get(product);
        } else {
            return 0;
        }
    }

    public boolean take(String product) {
        if (this.wareStock.containsKey(product) && this.wareStock.get(product) > 0) {
            this.wareStock.put(product, this.wareStock.get(product) - 1);
            return true;
        } else {
            return false;
        }
    }

    public Set<String> products(){
        Set<String> set = new HashSet();
        for(String key : this.warePrice.keySet()) {
            set.add(key);
        }
        return set;
    }
}
