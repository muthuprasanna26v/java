import java.util.LinkedHashSet;

public class LinkedHashSetBasics {
    
    public static void main(String[] args) {
        LinkedHashSet<String> set = new LinkedHashSet<>();
        
        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");
        set.add("Apple");
        
        System.out.println("LinkedHashSet: " + set);
        System.out.println("Size: " + set.size());
        
        System.out.println("Contains Banana: " + set.contains("Banana"));
        
        set.remove("Apple");
        System.out.println("After removing Apple: " + set);
    }
}
