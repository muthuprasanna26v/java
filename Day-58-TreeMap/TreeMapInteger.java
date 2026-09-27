import java.util.TreeMap;

public class TreeMapInteger {
    
    public static void main(String[] args) {
        TreeMap<Integer, String> map = new TreeMap<>();
        
        map.put(50, "Fifty");
        map.put(10, "Ten");
        map.put(30, "Thirty");
        map.put(20, "Twenty");
        
        System.out.println("TreeMap: " + map);
        System.out.println("First entry: " + map.firstEntry());
        System.out.println("Last entry: " + map.lastEntry());
        
        System.out.println("Poll first: " + map.pollFirstEntry());
        System.out.println("After poll first: " + map);
        
        System.out.println("Poll last: " + map.pollLastEntry());
        System.out.println("After poll last: " + map);
    }
}
