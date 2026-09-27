public class BasicDoWhileLoop {
    public static void main(String[] args) {
        int i = 1;
        do {
            System.out.println("Iteration: " + i);
            i++;
        } while (i <= 5);
        
        int j = 0;
        do {
            System.out.print(j + " ");
            j++;
        } while (j < 10);
        System.out.println();
        
        int k = 10;
        do {
            System.out.print(k + " ");
            k--;
        } while (k >= 1);
        System.out.println();
        
        int sum = 0;
        int n = 1;
        do {
            sum += n;
            n++;
        } while (n <= 10);
        System.out.println("Sum of 1 to 10: " + sum);
    }
}
