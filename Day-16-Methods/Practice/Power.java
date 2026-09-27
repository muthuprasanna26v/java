public class Power {
    
    public static int power(int base, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= base;
        }
        return result;
    }
    
    public static void main(String[] args) {
        System.out.println("2^3 = " + power(2, 3));
        System.out.println("5^2 = " + power(5, 2));
        System.out.println("3^4 = " + power(3, 4));
    }
}
