public class SumOfArray {
    
    public static int sum(int[] arr) {
        int total = 0;
        for (int num : arr) {
            total += num;
        }
        return total;
    }
    
    public static double average(int[] arr) {
        if (arr.length == 0) {
            return 0;
        }
        return (double) sum(arr) / arr.length;
    }
    
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        
        System.out.println("Sum: " + sum(numbers));
        System.out.println("Average: " + average(numbers));
    }
}
