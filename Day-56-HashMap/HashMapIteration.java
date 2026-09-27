import java.util.HashMap;
import java.util.Map;

public class HashMapIteration {
    
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        
        map.put("Apple", 10);
        map.put("Banana", 20);
        map.put("Cherry", 30);
        
        System.out.println("Using keySet:");
        for (String key : map.keySet()) {
            System.out.println(key + " = " + map.get(key));
        }
        
        System.out.println("\nUsing entrySet:");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
        
        System.out.println("\nUsing forEach:");
        map.forEach((key, value) -> System.out.println(key + " = " + value));
    }
}
