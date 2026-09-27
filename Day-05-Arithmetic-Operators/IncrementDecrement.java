public class IncrementDecrement {
    public static void main(String[] args) {
        int a = 10;
        
        System.out.println("Initial a: " + a);
        
        a++;
        System.out.println("After a++: " + a);
        
        ++a;
        System.out.println("After ++a: " + a);
        
        a--;
        System.out.println("After a--: " + a);
        
        --a;
        System.out.println("After --a: " + a);
        
        int b = 5;
        int c = b++;
        System.out.println("Post-increment: b = " + b + ", c = " + c);
        
        int d = 5;
        int e = ++d;
        System.out.println("Pre-increment: d = " + d + ", e = " + e);
        
        int f = 5;
        int g = f--;
        System.out.println("Post-decrement: f = " + f + ", g = " + g);
        
        int h = 5;
        int i = --h;
        System.out.println("Pre-decrement: h = " + h + ", i = " + i);
    }
}
