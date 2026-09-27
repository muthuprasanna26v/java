public class NumberComparison {
    public static void main(String[] args) {
        int num1 = 15;
        int num2 = 25;
        int num3 = 15;
        
        System.out.println("num1 = " + num1 + ", num2 = " + num2 + ", num3 = " + num3);
        
        if (num1 == num2) {
            System.out.println("num1 is equal to num2");
        } else {
            System.out.println("num1 is not equal to num2");
        }
        
        if (num1 == num3) {
            System.out.println("num1 is equal to num3");
        } else {
            System.out.println("num1 is not equal to num3");
        }
        
        if (num1 < num2 && num1 > 10) {
            System.out.println("num1 is between 10 and num2");
        }
        
        if (num2 >= num3 || num2 <= 30) {
            System.out.println("num2 satisfies the condition");
        }
    }
}
