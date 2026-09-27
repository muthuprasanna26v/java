import java.util.LinkedList;

public class QueueOperations {
    
    public static void main(String[] args) {
        LinkedList<Integer> queue = new LinkedList<>();
        
        queue.offer(10);
        queue.offer(20);
        queue.offer(30);
        
        System.out.println("Queue: " + queue);
        
        System.out.println("Poll: " + queue.poll());
        System.out.println("After poll: " + queue);
        
        System.out.println("Peek: " + queue.peek());
        
        System.out.println("Size: " + queue.size());
    }
}
