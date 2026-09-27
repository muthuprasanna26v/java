public class MethodWithReturn {
    
    public static int add(int a, int b) {
        return a + b;
    }
    
    public static int subtract(int a, int b) {
        return a - b;
    }
    
    public static int multiply(int a, int b) {
        return a * b;
    }
    
    public static double divide(int a, int b) {
        return (double) a / b;
    }
    
    public static int getMax(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }
    
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
    
    public static void main(String[] args) {
        int sum = add(10, 20);
        System.out.println("Sum: " + sum);
        
        int difference = subtract(20, 10);
        System.out.println("Difference: " + difference);
        
        int product = multiply(5, 6);
        System.out.println("Product: " + product);
        
        double quotient = divide(10, 3);
        System.out.println("Quotient: " + quotient);
        
        int max = getMax(15, 25);
        System.out.println("Maximum: " + max);
        
        boolean even = isEven(8);
        System.out.println("Is 8 even? " + even);
    }
}
