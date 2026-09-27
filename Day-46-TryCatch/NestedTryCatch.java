public class NestedTryCatch {
    
    public static void main(String[] args) {
        try {
            try {
                int[] numbers = {1, 2, 3};
                System.out.println(numbers[5]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Inner catch: Array index out of bounds");
            }
            
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Outer catch: Cannot divide by zero");
        }
        
        System.out.println("Program continues");
    }
}
