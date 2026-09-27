import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println("Sum of 1 to " + n + ": " + sum);
        
        int sumEven = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                sumEven += i;
            }
        }
        System.out.println("Sum of even numbers from 1 to " + n + ": " + sumEven);
        
        int sumOdd = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                sumOdd += i;
            }
        }
        System.out.println("Sum of odd numbers from 1 to " + n + ": " + sumOdd);
        
        scanner.close();
    }
}
