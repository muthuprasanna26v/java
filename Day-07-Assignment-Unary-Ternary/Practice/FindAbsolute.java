import java.util.Scanner;

public class FindAbsolute {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        int absolute = (number >= 0) ? number : -number;
        System.out.println("Absolute value: " + absolute);
        
        scanner.close();
    }
}
