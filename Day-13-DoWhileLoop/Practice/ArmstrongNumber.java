import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        int original = number;
        int sum = 0;
        int temp = number;
        int digits = 0;
        
        while (temp != 0) {
            digits++;
            temp /= 10;
        }
        
        temp = number;
        do {
            int digit = temp % 10;
            int power = 1;
            for (int i = 0; i < digits; i++) {
                power *= digit;
            }
            sum += power;
            temp /= 10;
        } while (temp != 0);
        
        if (original == sum) {
            System.out.println(original + " is an Armstrong number");
        } else {
            System.out.println(original + " is not an Armstrong number");
        }
        
        scanner.close();
    }
}
