public class OverloadingTypes {
    
    public static void display(int number) {
        System.out.println("Int: " + number);
    }
    
    public static void display(double number) {
        System.out.println("Double: " + number);
    }
    
    public static void display(String text) {
        System.out.println("String: " + text);
    }
    
    public static void display(int a, int b) {
        System.out.println("Two ints: " + a + ", " + b);
    }
    
    public static void main(String[] args) {
        display(10);
        display(10.5);
        display("Hello");
        display(5, 15);
    }
}
