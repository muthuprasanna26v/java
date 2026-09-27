public class ThrowKeyword {
    
    public static void validateAge(int age) {
        if (age < 18) {
            throw new ArithmeticException("Not eligible to vote");
        } else {
            System.out.println("Eligible to vote");
        }
    }
    
    public static void main(String[] args) {
        try {
            validateAge(15);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        
        try {
            validateAge(25);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}
