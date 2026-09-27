import java.util.ArrayDeque;
import java.util.Deque;

public class DequeAsStack {
    
    public static void main(String[] args) {
        Deque<Integer> stack = new ArrayDeque<>();
        
        stack.push(10);
        stack.push(20);
        stack.push(30);
        
        System.out.println("Stack: " + stack);
        
        System.out.println("Pop: " + stack.pop());
        System.out.println("After pop: " + stack);
        
        System.out.println("Peek: " + stack.peek());
        
        System.out.println("Is empty: " + stack.isEmpty());
    }
}
