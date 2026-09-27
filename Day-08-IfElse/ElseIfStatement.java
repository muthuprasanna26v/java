public class ElseIfStatement {
    public static void main(String[] args) {
        int marks = 75;
        
        if (marks >= 90) {
            System.out.println("Grade: A");
        } else if (marks >= 80) {
            System.out.println("Grade: B");
        } else if (marks >= 70) {
            System.out.println("Grade: C");
        } else if (marks >= 60) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Grade: F");
        }
        
        int number = 0;
        
        if (number > 0) {
            System.out.println("Number is positive");
        } else if (number < 0) {
            System.out.println("Number is negative");
        } else {
            System.out.println("Number is zero");
        }
        
        int age = 25;
        
        if (age < 13) {
            System.out.println("Child");
        } else if (age < 20) {
            System.out.println("Teenager");
        } else if (age < 60) {
            System.out.println("Adult");
        } else {
            System.out.println("Senior");
        }
        
        int score = 55;
        
        if (score >= 80) {
            System.out.println("Excellent");
        } else if (score >= 60) {
            System.out.println("Good");
        } else if (score >= 40) {
            System.out.println("Average");
        } else {
            System.out.println("Needs Improvement");
        }
    }
}
