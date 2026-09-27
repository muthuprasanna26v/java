import java.util.ArrayList;
import java.util.ListIterator;

public class ListIterator {
    
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        
        System.out.println("Forward:");
        ListIterator<String> iterator = list.listIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        
        System.out.println("\nBackward:");
        while (iterator.hasPrevious()) {
            System.out.println(iterator.previous());
        }
        
        System.out.println("\nAdding element:");
        iterator = list.listIterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            if (element.equals("Banana")) {
                iterator.add("Blueberry");
            }
        }
        System.out.println(list);
    }
}
