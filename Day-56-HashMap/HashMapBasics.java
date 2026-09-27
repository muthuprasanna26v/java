import java.util.HashMap;

public class HashMapBasics {
    
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        
        map.put("John", 25);
        map.put("Alice", 30);
        map.put("Bob", 28);
        
        System.out.println("HashMap: " + map);
        System.out.println("Size: " + map.size());
        
        System.out.println("Age of John: " + map.get("John"));
        System.out.println("Age of Alice: " + map.get("Alice"));
        
        System.out.println("Contains key Bob: " + map.containsKey("Bob"));
        System.out.println("Contains value 30: " + map.containsValue(30));
        
        map.put("John", 26);
        System.out.println("After updating John: " + map);
        
        map.remove("Alice");
        System.out.println("After removing Alice: " + map);
        
        System.out.println("Keys: " + map.keySet());
        System.out.println("Values: " + map.values());
    }
}
