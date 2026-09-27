import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CollectionOperations {
    
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        
        List<Integer> list2 = new ArrayList<>();
        list2.add(3);
        list2.add(4);
        list2.add(5);
        
        Set<Integer> union = new HashSet<>(list1);
        union.addAll(list2);
        System.out.println("Union: " + union);
        
        Set<Integer> intersection = new HashSet<>(list1);
        intersection.retainAll(list2);
        System.out.println("Intersection: " + intersection);
        
        Set<Integer> difference = new HashSet<>(list1);
        difference.removeAll(list2);
        System.out.println("Difference (list1 - list2): " + difference);
    }
}
