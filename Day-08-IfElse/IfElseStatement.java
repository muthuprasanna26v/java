public class IfElseStatement {
    public static void main(String[] args) {
        int number = -5;
        
        if (number >= 0) {
            System.out.println("Number is positive or zero");
        } else {
            System.out.println("Number is negative");
        }
        
        int age = 15;
        
        if (age >= 18) {
            System.out.println("You are eligible to vote");
        } else {
            System.out.println("You are not eligible to vote");
        }
        
        int marks = 85;
        
        if (marks >= 40) {
            System.out.println("Result: Pass");
        } else {
            System.out.println("Result: Fail");
        }
        
        int year = 2024;
        
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " is a leap year");
        } else {
            System.out.println(year + " is not a leap year");
        }
    }
}
