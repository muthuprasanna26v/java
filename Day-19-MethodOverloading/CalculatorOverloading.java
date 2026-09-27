public class CalculatorOverloading {
    
    public static int multiply(int a, int b) {
        return a * b;
    }
    
    public static double multiply(double a, double b) {
        return a * b;
    }
    
    public static int multiply(int a, int b, int c) {
        return a * b * c;
    }
    
    public static double divide(int a, int b) {
        return (double) a / b;
    }
    
    public static double divide(double a, double b) {
        return a / b;
    }
    
    public static void main(String[] args) {
        System.out.println("multiply(5, 3): " + multiply(5, 3));
        System.out.println("multiply(5.5, 3.0): " + multiply(5.5, 3.0));
        System.out.println("multiply(2, 3, 4): " + multiply(2, 3, 4));
        System.out.println("divide(10, 3): " + divide(10, 3));
        System.out.println("divide(10.0, 3.0): " + divide(10.0, 3.0));
    }
}
