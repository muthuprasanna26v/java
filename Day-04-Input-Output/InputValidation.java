import java.util.Scanner;

public class InputValidation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a positive number: ");
        int number = scanner.nextInt();
        
        if (number > 0) {
            System.out.println("Valid positive number: " + number);
        } else {
            System.out.println("Invalid number. Please enter a positive number.");
        }
        
        System.out.print("Enter your grade (A, B, C, D, F): ");
        char grade = scanner.next().charAt(0);
        
        if (grade == 'A' || grade == 'B' || grade == 'C' || grade == 'D' || grade == 'F') {
            System.out.println("Valid grade: " + grade);
        } else {
            System.out.println("Invalid grade.");
        }
        
        scanner.close();
    }
}
