import java.util.HashSet;

public class HashSetBasics {
    
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        
        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");
        set.add("Apple");
        
        System.out.println("HashSet: " + set);
        System.out.println("Size: " + set.size());
        
        System.out.println("Contains Banana: " + set.contains("Banana"));
        System.out.println("Contains Grape: " + set.contains("Grape"));
        
        set.remove("Apple");
        System.out.println("After removing Apple: " + set);
        
        set.clear();
        System.out.println("After clear: " + set);
        System.out.println("Is empty: " + set.isEmpty());
    }
}
