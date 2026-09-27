public class RecursiveSum {
    
    public static int sum(int n) {
        if (n <= 0) {
            return 0;
        }
        return n + sum(n - 1);
    }
    
    public static void main(String[] args) {
        System.out.println("Sum of 1 to 10: " + sum(10));
        System.out.println("Sum of 1 to 5: " + sum(5));
    }
}
