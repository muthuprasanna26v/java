import java.util.Scanner;

public class CheckEligibility {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        
        System.out.print("Do you have a valid ID? (true/false): ");
        boolean hasId = scanner.nextBoolean();
        
        if (age >= 18 && hasId) {
            System.out.println("You are eligible to vote.");
        } else {
            System.out.println("You are not eligible to vote.");
        }
        
        scanner.close();
    }
}
