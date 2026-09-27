public class RecursivePower {
    
    public static int power(int base, int exponent) {
        if (exponent == 0) {
            return 1;
        }
        return base * power(base, exponent - 1);
    }
    
    public static void main(String[] args) {
        System.out.println("2^5: " + power(2, 5));
        System.out.println("3^4: " + power(3, 4));
        System.out.println("5^2: " + power(5, 2));
    }
}
