public class Pair<K, V> {
    private K key;
    private V value;

    public Pair(K Key ,V Value) {
        this.key = Key;
        this.value = Value;
    }

    public K getKey() {
        return this.key;
    }

    public V getValue() {
        return this.value;
    }

    public void setValue(V value) {
        this.value = value;
    }

}
