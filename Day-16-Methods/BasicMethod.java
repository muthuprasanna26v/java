public class BasicMethod {
    
    public static void sayHello() {
        System.out.println("Hello, World!");
    }
    
    public static void greet(String name) {
        System.out.println("Hello, " + name + "!");
    }
    
    public static void printNumber(int number) {
        System.out.println("Number: " + number);
    }
    
    public static void main(String[] args) {
        sayHello();
        sayHello();
        
        greet("John");
        greet("Alice");
        
        printNumber(10);
        printNumber(20);
        printNumber(30);
    }
}
