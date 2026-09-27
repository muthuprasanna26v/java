import java.util.Scanner;

public class ContinueUntilZero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int sum = 0;
        int count = 0;
        int number;
        
        System.out.println("Enter numbers to calculate average (enter 0 to stop):");
        
        do {
            number = scanner.nextInt();
            
            if (number != 0) {
                sum += number;
                count++;
            }
        } while (number != 0);
        
        if (count > 0) {
            double average = (double) sum / count;
            System.out.println("Sum: " + sum);
            System.out.println("Count: " + count);
            System.out.println("Average: " + average);
        } else {
            System.out.println("No numbers entered");
        }
        
        scanner.close();
    }
}
