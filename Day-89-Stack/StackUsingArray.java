public class StackUsingArray {
    private int[] stack;
    private int top;
    private int capacity;
    
    public StackUsingArray(int capacity) {
        this.capacity = capacity;
        this.stack = new int[capacity];
        this.top = -1;
    }
    
    public void push(int value) {
        if (isFull()) {
            System.out.println("Stack is full");
            return;
        }
        stack[++top] = value;
    }
    
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return stack[top--];
    }
    
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return stack[top];
    }
    
    public boolean isEmpty() {
        return top == -1;
    }
    
    public boolean isFull() {
        return top == capacity - 1;
    }
    
    public static void main(String[] args) {
        StackUsingArray stack = new StackUsingArray(5);
        
        stack.push(10);
        stack.push(20);
        stack.push(30);
        
        System.out.println("Peek: " + stack.peek());
        System.out.println("Pop: " + stack.pop());
        System.out.println("Pop: " + stack.pop());
        
        System.out.println("Is empty: " + stack.isEmpty());
    }
}
