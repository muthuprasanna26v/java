import java.util.Scanner;

public class UserDetails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter first name: ");
        String firstName = scanner.nextLine();
        
        System.out.print("Enter last name: ");
        String lastName = scanner.nextLine();
        
        System.out.print("Enter city: ");
        String city = scanner.nextLine();
        
        System.out.print("Enter country: ");
        String country = scanner.nextLine();
        
        System.out.println("Full Name: " + firstName + " " + lastName);
        System.out.println("Location: " + city + ", " + country);
        
        scanner.close();
    }
}
