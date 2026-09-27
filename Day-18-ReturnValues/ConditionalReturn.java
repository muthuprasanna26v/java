public class ConditionalReturn {
    
    public static int absolute(int number) {
        if (number >= 0) {
            return number;
        } else {
            return -number;
        }
    }
    
    public static String getGrade(int marks) {
        if (marks >= 90) {
            return "A";
        } else if (marks >= 80) {
            return "B";
        } else if (marks >= 70) {
            return "C";
        } else if (marks >= 60) {
            return "D";
        } else {
            return "F";
        }
    }
    
    public static int max(int a, int b, int c) {
        if (a >= b && a >= c) {
            return a;
        } else if (b >= a && b >= c) {
            return b;
        } else {
            return c;
        }
    }
    
    public static String checkNumber(int number) {
        if (number > 0) {
            return "Positive";
        } else if (number < 0) {
            return "Negative";
        } else {
            return "Zero";
        }
    }
    
    public static void main(String[] args) {
        System.out.println("Absolute of -10: " + absolute(-10));
        System.out.println("Absolute of 15: " + absolute(15));
        
        System.out.println("Grade for 85: " + getGrade(85));
        System.out.println("Grade for 92: " + getGrade(92));
        
        System.out.println("Max of 10, 20, 15: " + max(10, 20, 15));
        
        System.out.println("Check 5: " + checkNumber(5));
        System.out.println("Check -3: " + checkNumber(-3));
        System.out.println("Check 0: " + checkNumber(0));
    }
}
