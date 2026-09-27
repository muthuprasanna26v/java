public class MethodTypes {
    
    public static void noReturnNoParams() {
        System.out.println("Method with no return and no parameters");
    }
    
    public static void noReturnWithParams(int a, int b) {
        System.out.println("Sum: " + (a + b));
    }
    
    public static int returnNoParams() {
        return 100;
    }
    
    public static int returnWithParams(int a, int b) {
        return a + b;
    }
    
    public static String returnString(String name) {
        return "Hello, " + name;
    }
    
    public static boolean returnBoolean(int number) {
        return number > 0;
    }
    
    public static void main(String[] args) {
        noReturnNoParams();
        
        noReturnWithParams(10, 20);
        
        int value = returnNoParams();
        System.out.println("Returned value: " + value);
        
        int sum = returnWithParams(5, 15);
        System.out.println("Sum: " + sum);
        
        String message = returnString("Java");
        System.out.println(message);
        
        boolean isPositive = returnBoolean(-5);
        System.out.println("Is positive: " + isPositive);
    }
}
