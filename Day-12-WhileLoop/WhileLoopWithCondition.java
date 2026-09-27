import java.util.Scanner;

public class WhileLoopWithCondition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int sum = 0;
        int number;
        
        System.out.println("Enter numbers to sum (enter 0 to stop):");
        while ((number = scanner.nextInt()) != 0) {
            sum += number;
        }
        System.out.println("Sum: " + sum);
        
        System.out.print("Enter a positive number: ");
        int num = scanner.nextInt();
        
        while (num <= 0) {
            System.out.print("Invalid! Enter a positive number: ");
            num = scanner.nextInt();
        }
        System.out.println("You entered: " + num);
        
        scanner.close();
    }
}
