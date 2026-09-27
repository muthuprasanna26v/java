import java.util.Scanner;

public class StudentMarks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter marks for subject 1: ");
        int mark1 = scanner.nextInt();
        
        System.out.print("Enter marks for subject 2: ");
        int mark2 = scanner.nextInt();
        
        System.out.print("Enter marks for subject 3: ");
        int mark3 = scanner.nextInt();
        
        int total = mark1 + mark2 + mark3;
        double average = total / 3.0;
        
        System.out.println("Total marks: " + total);
        System.out.println("Average: " + average);
        
        scanner.close();
    }
}
