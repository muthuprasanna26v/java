import java.util.Scanner;

public class CheckNumberRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        if (number >= 1 && number <= 10) {
            System.out.println("Number is between 1 and 10");
        } else if (number >= 11 && number <= 20) {
            System.out.println("Number is between 11 and 20");
        } else if (number >= 21 && number <= 30) {
            System.out.println("Number is between 21 and 30");
        } else {
            System.out.println("Number is outside the range 1-30");
        }
        
        scanner.close();
    }
}
