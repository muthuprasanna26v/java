public class TernaryOperator {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        
        int max = (a > b) ? a : b;
        System.out.println("Maximum of " + a + " and " + b + " is: " + max);
        
        int min = (a < b) ? a : b;
        System.out.println("Minimum of " + a + " and " + b + " is: " + min);
        
        int number = 15;
        String result = (number % 2 == 0) ? "Even" : "Odd";
        System.out.println(number + " is " + result);
        
        int score = 75;
        String grade = (score >= 90) ? "A" : (score >= 80) ? "B" : (score >= 70) ? "C" : (score >= 60) ? "D" : "F";
        System.out.println("Score: " + score + ", Grade: " + grade);
        
        int x = 5;
        int y = 10;
        int z = 15;
        int largest = (x > y) ? ((x > z) ? x : z) : ((y > z) ? y : z);
        System.out.println("Largest of " + x + ", " + y + ", " + z + " is: " + largest);
        
        boolean isAdult = true;
        String message = isAdult ? "You can vote" : "You cannot vote";
        System.out.println(message);
    }
}
