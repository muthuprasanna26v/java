public class ShortCircuitEvaluation {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        
        boolean result1 = (a > 5) && (b++ > 15);
        System.out.println("Result1: " + result1);
        System.out.println("b after &&: " + b);
        
        int c = 10;
        int d = 20;
        
        boolean result2 = (c < 5) && (d++ > 15);
        System.out.println("Result2: " + result2);
        System.out.println("d after && (short-circuit): " + d);
        
        int e = 10;
        int f = 20;
        
        boolean result3 = (e > 5) || (f++ > 25);
        System.out.println("Result3: " + result3);
        System.out.println("f after || (short-circuit): " + f);
        
        int g = 10;
        int h = 20;
        
        boolean result4 = (g < 5) || (h++ > 15);
        System.out.println("Result4: " + result4);
        System.out.println("h after ||: " + h);
    }
}
