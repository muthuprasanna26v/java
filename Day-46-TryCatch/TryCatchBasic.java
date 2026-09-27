public class TryCatchBasic {
    
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3};
        
        try {
            System.out.println(numbers[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bounds");
        }
        
        try {
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        }
        
        try {
            String str = null;
            System.out.println(str.length());
        } catch (NullPointerException e) {
            System.out.println("Null pointer exception");
        }
        
        System.out.println("Program continues");
    }
}
