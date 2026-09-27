import java.util.Scanner;

public class StudentGrading {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter marks for Subject 1: ");
        int mark1 = scanner.nextInt();
        
        System.out.print("Enter marks for Subject 2: ");
        int mark2 = scanner.nextInt();
        
        System.out.print("Enter marks for Subject 3: ");
        int mark3 = scanner.nextInt();
        
        int total = mark1 + mark2 + mark3;
        double average = total / 3.0;
        
        System.out.println("Total: " + total);
        System.out.println("Average: " + average);
        
        if (average >= 90) {
            System.out.println("Grade: A+");
        } else if (average >= 80) {
            System.out.println("Grade: A");
        } else if (average >= 70) {
            System.out.println("Grade: B");
        } else if (average >= 60) {
            System.out.println("Grade: C");
        } else if (average >= 50) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Grade: F");
        }
        
        if (average >= 40) {
            System.out.println("Result: Pass");
        } else {
            System.out.println("Result: Fail");
        }
        
        scanner.close();
    }
}
