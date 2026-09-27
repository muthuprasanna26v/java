import java.util.TreeSet;

public class TreeSetBasics {
    
    public static void main(String[] args) {
        TreeSet<String> set = new TreeSet<>();
        
        set.add("Banana");
        set.add("Apple");
        set.add("Cherry");
        set.add("Apple");
        
        System.out.println("TreeSet: " + set);
        System.out.println("Size: " + set.size());
        
        System.out.println("First: " + set.first());
        System.out.println("Last: " + set.last());
        
        System.out.println("HeadSet (Cherry): " + set.headSet("Cherry"));
        System.out.println("TailSet (Cherry): " + set.tailSet("Cherry"));
        
        System.out.println("Lower than Cherry: " + set.lower("Cherry"));
        System.out.println("Higher than Cherry: " + set.higher("Cherry"));
    }
}
