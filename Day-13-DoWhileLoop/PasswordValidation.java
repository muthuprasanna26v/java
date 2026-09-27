import java.util.Scanner;

public class PasswordValidation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password;
        String correctPassword = "java123";
        
        do {
            System.out.print("Enter password: ");
            password = scanner.nextLine();
            
            if (!password.equals(correctPassword)) {
                System.out.println("Incorrect password. Try again.");
            }
        } while (!password.equals(correctPassword));
        
        System.out.println("Access granted!");
        
        scanner.close();
    }
}
