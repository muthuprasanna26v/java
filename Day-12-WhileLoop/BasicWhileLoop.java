public class BasicWhileLoop {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 5) {
            System.out.println("Iteration: " + i);
            i++;
        }
        
        int j = 0;
        while (j < 10) {
            System.out.print(j + " ");
            j++;
        }
        System.out.println();
        
        int k = 10;
        while (k >= 1) {
            System.out.print(k + " ");
            k--;
        }
        System.out.println();
        
        int sum = 0;
        int n = 1;
        while (n <= 10) {
            sum += n;
            n++;
        }
        System.out.println("Sum of 1 to 10: " + sum);
    }
}
