import java.util.TreeSet;

public class TreeSetInteger {
    
    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<>();
        
        numbers.add(50);
        numbers.add(10);
        numbers.add(30);
        numbers.add(20);
        numbers.add(40);
        
        System.out.println("TreeSet: " + numbers);
        System.out.println("First: " + numbers.first());
        System.out.println("Last: " + numbers.last());
        
        System.out.println("HeadSet (30): " + numbers.headSet(30));
        System.out.println("TailSet (30): " + numbers.tailSet(30));
        System.out.println("SubSet (20, 40): " + numbers.subSet(20, 40));
    }
}
