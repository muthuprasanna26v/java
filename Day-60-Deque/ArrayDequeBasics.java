import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeBasics {
    
    public static void main(String[] args) {
        Deque<String> deque = new ArrayDeque<>();
        
        deque.addFirst("First");
        deque.addLast("Last");
        deque.add("Middle");
        
        System.out.println("Deque: " + deque);
        
        System.out.println("First: " + deque.getFirst());
        System.out.println("Last: " + deque.getLast());
        
        deque.removeFirst();
        System.out.println("After removeFirst: " + deque);
        
        deque.removeLast();
        System.out.println("After removeLast: " + deque);
        
        deque.addFirst("New First");
        deque.addLast("New Last");
        System.out.println("After adding: " + deque);
    }
}
