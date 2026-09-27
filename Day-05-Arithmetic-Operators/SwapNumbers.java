public class SwapNumbers {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        
        System.out.println("Before swap: a = " + a + ", b = " + b);
        
        int temp = a;
        a = b;
        b = temp;
        
        System.out.println("After swap: a = " + a + ", b = " + b);
        
        int x = 5;
        int y = 8;
        
        System.out.println("Before swap: x = " + x + ", y = " + y);
        
        x = x + y;
        y = x - y;
        x = x - y;
        
        System.out.println("After swap: x = " + x + ", y = " + y);
    }
}
