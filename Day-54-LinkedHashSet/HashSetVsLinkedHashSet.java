import java.util.HashSet;
import java.util.LinkedHashSet;

public class HashSetVsLinkedHashSet {
    
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Zebra");
        hashSet.add("Apple");
        hashSet.add("Mango");
        
        System.out.println("HashSet (no order): " + hashSet);
        
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("Zebra");
        linkedHashSet.add("Apple");
        linkedHashSet.add("Mango");
        
        System.out.println("LinkedHashSet (insertion order): " + linkedHashSet);
    }
}
