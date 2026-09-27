public class ArithmeticExpressions {
    public static void main(String[] args) {
        int result1 = 10 + 5 * 2;
        System.out.println("10 + 5 * 2 = " + result1);
        
        int result2 = (10 + 5) * 2;
        System.out.println("(10 + 5) * 2 = " + result2);
        
        int result3 = 20 / 5 + 3;
        System.out.println("20 / 5 + 3 = " + result3);
        
        int result4 = 20 / (5 + 3);
        System.out.println("20 / (5 + 3) = " + result4);
        
        int result5 = 10 + 20 / 5 * 3 - 2;
        System.out.println("10 + 20 / 5 * 3 - 2 = " + result5);
        
        double result6 = 10.0 / 3.0;
        System.out.println("10.0 / 3.0 = " + result6);
        
        int a = 15;
        int b = 4;
        int result7 = (a + b) * (a - b);
        System.out.println("(15 + 4) * (15 - 4) = " + result7);
    }
}
