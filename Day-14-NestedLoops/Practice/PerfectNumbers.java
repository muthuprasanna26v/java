public class PerfectNumbers {
    public static void main(String[] args) {
        int limit = 1000;
        
        System.out.println("Perfect numbers up to " + limit + ":");
        
        for (int num = 1; num <= limit; num++) {
            int sum = 0;
            
            for (int i = 1; i < num; i++) {
                if (num % i == 0) {
                    sum += i;
                }
            }
            
            if (sum == num && num != 0) {
                System.out.println(num);
            }
        }
    }
}
