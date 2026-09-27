public class ArrayMinMax {
    
    public static int findMin(int[] arr) {
        int min = arr[0];
        for (int num : arr) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }
    
    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }
    
    public static void main(String[] args) {
        int[] numbers = {15, 8, 25, 3, 12, 30};
        
        System.out.println("Array: 15, 8, 25, 3, 12, 30");
        System.out.println("Minimum: " + findMin(numbers));
        System.out.println("Maximum: " + findMax(numbers));
    }
}
