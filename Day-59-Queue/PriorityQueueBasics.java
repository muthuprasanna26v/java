import java.util.PriorityQueue;

public class PriorityQueueBasics {
    
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        pq.add(10);
        pq.add(30);
        pq.add(20);
        pq.add(50);
        pq.add(40);
        
        System.out.println("PriorityQueue: " + pq);
        
        System.out.println("Peek: " + pq.peek());
        
        System.out.println("Poll: " + pq.poll());
        System.out.println("After poll: " + pq);
        
        System.out.println("Poll: " + pq.poll());
        System.out.println("After poll: " + pq);
        
        System.out.println("Size: " + pq.size());
        System.out.println("Contains 30: " + pq.contains(30));
    }
}
