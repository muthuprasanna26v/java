import java.util.TreeMap;

public class TreeMapBasics {
    
    public static void main(String[] args) {
        TreeMap<String, Integer> map = new TreeMap<>();
        
        map.put("Zebra", 1);
        map.put("Apple", 2);
        map.put("Mango", 3);
        
        System.out.println("TreeMap: " + map);
        System.out.println("Size: " + map.size());
        
        System.out.println("First key: " + map.firstKey());
        System.out.println("Last key: " + map.lastKey());
        
        System.out.println("HeadMap (Mango): " + map.headMap("Mango"));
        System.out.println("TailMap (Mango): " + map.tailMap("Mango"));
        
        System.out.println("Lower key than Mango: " + map.lowerKey("Mango"));
        System.out.println("Higher key than Mango: " + map.higherKey("Mango"));
    }
}
