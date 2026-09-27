public class IfStatement {
    public static void main(String[] args) {
        int number = 10;
        
        if (number > 0) {
            System.out.println("Number is positive");
        }
        
        int age = 18;
        
        if (age >= 18) {
            System.out.println("You are eligible to vote");
        }
        
        boolean isRaining = true;
        
        if (isRaining) {
            System.out.println("Take an umbrella");
        }
        
        char grade = 'A';
        
        if (grade == 'A' || grade == 'B' || grade == 'C') {
            System.out.println("Grade is passing");
        }
    }
}
