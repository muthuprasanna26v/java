import java.util.Scanner;

public class CheckPassFail {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter your marks: ");
        int marks = scanner.nextInt();
        
        String result = (marks >= 40) ? "Pass" : "Fail";
        System.out.println("Result: " + result);
        
        scanner.close();
    }
}
