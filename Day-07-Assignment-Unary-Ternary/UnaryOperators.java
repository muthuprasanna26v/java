public class UnaryOperators {
    public static void main(String[] args) {
        int a = 10;
        
        System.out.println("a = " + a);
        System.out.println("+a: " + (+a));
        System.out.println("-a: " + (-a));
        
        boolean flag = true;
        System.out.println("flag = " + flag);
        System.out.println("!flag: " + (!flag));
        
        int b = 5;
        System.out.println("b = " + b);
        System.out.println("b++: " + (b++));
        System.out.println("After b++: " + b);
        
        int c = 5;
        System.out.println("c = " + c);
        System.out.println("++c: " + (++c));
        System.out.println("After ++c: " + c);
        
        int d = 5;
        System.out.println("d = " + d);
        System.out.println("d--: " + (d--));
        System.out.println("After d--: " + d);
        
        int e = 5;
        System.out.println("e = " + e);
        System.out.println("--e: " + (--e));
        System.out.println("After --e: " + e);
    }
}
