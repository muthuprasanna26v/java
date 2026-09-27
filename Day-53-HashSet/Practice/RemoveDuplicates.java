import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class RemoveDuplicates {
    
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(2);
        list.add(1);
        list.add(4);
        
        System.out.println("Original list: " + list);
        
        HashSet<Integer> set = new HashSet<>(list);
        System.out.println("Without duplicates: " + set);
        
        List<Integer> uniqueList = new ArrayList<>(set);
        System.out.println("Unique list: " + uniqueList);
    }
}
