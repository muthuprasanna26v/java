import java.util.Scanner;

public class MenuDriven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        
        do {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            
            switch (choice) {
                case 1:
                    System.out.print("Enter two numbers: ");
                    int a1 = scanner.nextInt();
                    int b1 = scanner.nextInt();
                    System.out.println("Sum: " + (a1 + b1));
                    break;
                case 2:
                    System.out.print("Enter two numbers: ");
                    int a2 = scanner.nextInt();
                    int b2 = scanner.nextInt();
                    System.out.println("Difference: " + (a2 - b2));
                    break;
                case 3:
                    System.out.print("Enter two numbers: ");
                    int a3 = scanner.nextInt();
                    int b3 = scanner.nextInt();
                    System.out.println("Product: " + (a3 * b3));
                    break;
                case 4:
                    System.out.print("Enter two numbers: ");
                    int a4 = scanner.nextInt();
                    int b4 = scanner.nextInt();
                    if (b4 != 0) {
                        System.out.println("Quotient: " + (a4 / b4));
                    } else {
                        System.out.println("Cannot divide by zero");
                    }
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        } while (choice != 5);
        
        scanner.close();
    }
}
