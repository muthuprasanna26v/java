public class EarlyReturn {
    
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        if (number == 2) {
            return true;
        }
        if (number % 2 == 0) {
            return false;
        }
        
        for (int i = 3; i <= Math.sqrt(number); i += 2) {
            if (number % i == 0) {
                return false;
            }
        }
        
        return true;
    }
    
    public static int factorial(int n) {
        if (n < 0) {
            return -1;
        }
        if (n == 0 || n == 1) {
            return 1;
        }
        
        int result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
    
    public static String getCategory(int age) {
        if (age < 0) {
            return "Invalid age";
        }
        if (age < 13) {
            return "Child";
        }
        if (age < 20) {
            return "Teenager";
        }
        if (age < 60) {
            return "Adult";
        }
        return "Senior";
    }
    
    public static void main(String[] args) {
        System.out.println("Is 17 prime? " + isPrime(17));
        System.out.println("Is 15 prime? " + isPrime(15));
        System.out.println("Is 2 prime? " + isPrime(2));
        
        System.out.println("Factorial of 5: " + factorial(5));
        System.out.println("Factorial of 0: " + factorial(0));
        System.out.println("Factorial of -5: " + factorial(-5));
        
        System.out.println("Age 10: " + getCategory(10));
        System.out.println("Age 25: " + getCategory(25));
        System.out.println("Age 65: " + getCategory(65));
    }
}
