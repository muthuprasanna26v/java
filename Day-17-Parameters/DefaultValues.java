public class DefaultValues {
    
    public static void greet(String name) {
        greet(name, "Hello");
    }
    
    public static void greet(String name, String greeting) {
        System.out.println(greeting + ", " + name + "!");
    }
    
    public static int calculateArea(int length, int width) {
        return calculateArea(length, width, false);
    }
    
    public static int calculateArea(int length, int width, boolean isSquare) {
        if (isSquare) {
            return length * length;
        }
        return length * width;
    }
    
    public static void main(String[] args) {
        greet("John");
        greet("Alice", "Hi");
        
        System.out.println("Area: " + calculateArea(5, 10));
        System.out.println("Square area: " + calculateArea(5, 5, true));
    }
}
