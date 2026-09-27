public class NestedIf {
    public static void main(String[] args) {
        int age = 25;
        boolean hasLicense = true;
        
        if (age >= 18) {
            if (hasLicense) {
                System.out.println("You can drive");
            } else {
                System.out.println("You need a license to drive");
            }
        } else {
            System.out.println("You are too young to drive");
        }
        
        int marks = 85;
        
        if (marks >= 40) {
            if (marks >= 90) {
                System.out.println("Grade: A+");
            } else if (marks >= 80) {
                System.out.println("Grade: A");
            } else if (marks >= 70) {
                System.out.println("Grade: B");
            } else {
                System.out.println("Grade: C");
            }
        } else {
            System.out.println("Grade: F");
        }
        
        int number = 15;
        
        if (number > 0) {
            if (number % 2 == 0) {
                System.out.println("Positive even number");
            } else {
                System.out.println("Positive odd number");
            }
        } else if (number < 0) {
            if (number % 2 == 0) {
                System.out.println("Negative even number");
            } else {
                System.out.println("Negative odd number");
            }
        } else {
            System.out.println("Zero");
        }
    }
}
