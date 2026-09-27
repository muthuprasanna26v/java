public class MinMax {
    
    public static int min(int a, int b) {
        return (a < b) ? a : b;
    }
    
    public static int max(int a, int b) {
        return (a > b) ? a : b;
    }
    
    public static int min(int a, int b, int c) {
        return min(min(a, b), c);
    }
    
    public static int max(int a, int b, int c) {
        return max(max(a, b), c);
    }
    
    public static void main(String[] args) {
        System.out.println("Min of 10, 20: " + min(10, 20));
        System.out.println("Max of 10, 20: " + max(10, 20));
        System.out.println("Min of 10, 20, 30: " + min(10, 20, 30));
        System.out.println("Max of 10, 20, 30: " + max(10, 20, 30));
    }
}
