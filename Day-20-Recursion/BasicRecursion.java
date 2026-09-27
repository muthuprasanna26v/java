public class BasicRecursion {
    
    public static void countDown(int n) {
        if (n <= 0) {
            System.out.println("Done!");
            return;
        }
        System.out.println(n);
        countDown(n - 1);
    }
    
    public static void countUp(int n) {
        if (n <= 0) {
            return;
        }
        countUp(n - 1);
        System.out.println(n);
    }
    
    public static void main(String[] args) {
        System.out.println("Countdown:");
        countDown(5);
        
        System.out.println("\nCount up:");
        countUp(5);
    }
}
