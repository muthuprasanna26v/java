import java.util.LinkedList;

public class LinkedListStack {
    
    public static void main(String[] args) {
        LinkedList<Integer> stack = new LinkedList<>();
        
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
