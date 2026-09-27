public class LogicalOperators {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;
        
        System.out.println("a = " + a + ", b = " + b);
        System.out.println("a && b: " + (a && b));
        System.out.println("a || b: " + (a || b));
        System.out.println("!a: " + (!a));
        System.out.println("!b: " + (!b));
        
        int x = 10;
        int y = 20;
        int z = 30;
        
        System.out.println("x = " + x + ", y = " + y + ", z = " + z);
        System.out.println("(x < y) && (y < z): " + ((x < y) && (y < z)));
        System.out.println("(x > y) || (y < z): " + ((x > y) || (y < z)));
        System.out.println("!(x == y): " + (!(x == y)));
    }
}
