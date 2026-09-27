import java.util.LinkedList;

public class LinkedListBasics {
    
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        
        list.add("First");
        list.add("Second");
        list.add("Third");
        
        System.out.println("LinkedList: " + list);
        
        list.addFirst("Zero");
        list.addLast("Fourth");
        
        System.out.println("After addFirst and addLast: " + list);
        
        System.out.println("First element: " + list.getFirst());
        System.out.println("Last element: " + list.getLast());
        
        list.removeFirst();
        list.removeLast();
        
        System.out.println("After removeFirst and removeLast: " + list);
        
        list.remove(1);
        System.out.println("After removing index 1: " + list);
    }
}
