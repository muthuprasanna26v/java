class Pair<K, V> {
    private K key;
    private V value;
    
    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }
    
    public K getKey() {
        return key;
    }
    
    public V getValue() {
        return value;
    }
    
    @Override
    public String toString() {
        return key + " = " + value;
    }
}

public class GenericPair {
    
    public static void main(String[] args) {
        Pair<String, Integer> pair1 = new Pair<>("Age", 25);
        System.out.println(pair1);
        
        Pair<Integer, String> pair2 = new Pair<>(1, "One");
        System.out.println(pair2);
        
        Pair<String, Double> pair3 = new Pair<>("PI", 3.14159);
        System.out.println(pair3);
    }
}
