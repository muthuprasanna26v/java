import java.util.LinkedHashMap;

public class LinkedHashMapBasics {
    
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
        
        map.put("John", 25);
        map.put("Alice", 30);
        map.put("Bob", 28);
        
        System.out.println("LinkedHashMap: " + map);
        System.out.println("Size: " + map.size());
        
        System.out.println("Age of John: " + map.get("John"));
        
        map.put("John", 26);
        System.out.println("After updating John: " + map);
        
        map.remove("Alice");
        System.out.println("After removing Alice: " + map);
    }
}
