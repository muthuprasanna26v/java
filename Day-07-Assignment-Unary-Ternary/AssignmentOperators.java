public class AssignmentOperators {
    public static void main(String[] args) {
        int a = 10;
        
        a += 5;
        System.out.println("a += 5: " + a);
        
        a -= 3;
        System.out.println("a -= 3: " + a);
        
        a *= 2;
        System.out.println("a *= 2: " + a);
        
        a /= 4;
        System.out.println("a /= 4: " + a);
        
        a %= 3;
        System.out.println("a %= 3: " + a);
        
        int b = 20;
        b &= 15;
        System.out.println("b &= 15: " + b);
        
        int c = 20;
        c |= 10;
        System.out.println("c |= 10: " + c);
        
        int d = 20;
        d ^= 10;
        System.out.println("d ^= 10: " + d);
        
        int e = 20;
        e <<= 2;
        System.out.println("e <<= 2: " + e);
        
        int f = 20;
        f >>= 2;
        System.out.println("f >>= 2: " + f);
    }
}
