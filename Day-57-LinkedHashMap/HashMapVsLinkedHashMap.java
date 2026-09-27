import java.util.HashMap;
import java.util.LinkedHashMap;

public class HashMapVsLinkedHashMap {
    
    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Zebra", 1);
        hashMap.put("Apple", 2);
        hashMap.put("Mango", 3);
        
        System.out.println("HashMap (no order): " + hashMap);
        
        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("Zebra", 1);
        linkedHashMap.put("Apple", 2);
        linkedHashMap.put("Mango", 3);
        
        System.out.println("LinkedHashMap (insertion order): " + linkedHashMap);
    }
}
