import java.util.LinkedList;
import java.util.Queue;

public class QueueBasics {
    
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        
        queue.offer("First");
        queue.offer("Second");
        queue.offer("Third");
        
        System.out.println("Queue: " + queue);
        
        System.out.println("Peek: " + queue.peek());
        
        System.out.println("Poll: " + queue.poll());
        System.out.println("After poll: " + queue);
        
        System.out.println("Poll: " + queue.poll());
        System.out.println("After poll: " + queue);
        
        System.out.println("Size: " + queue.size());
        System.out.println("Is empty: " + queue.isEmpty());
    }
}
