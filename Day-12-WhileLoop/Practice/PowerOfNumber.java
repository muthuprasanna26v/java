import java.util.Scanner;

public class PowerOfNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter base: ");
        int base = scanner.nextInt();
        
        System.out.print("Enter exponent: ");
        int exponent = scanner.nextInt();
        
        int result = 1;
        int count = 0;
        
        while (count < exponent) {
            result *= base;
            count++;
        }
        
        System.out.println(base + " to the power of " + exponent + ": " + result);
        
        scanner.close();
    }
}
