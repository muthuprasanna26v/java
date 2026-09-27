public class MultipleReturnValues {
    
    public static int[] getMinMax(int[] arr) {
        int min = arr[0];
        int max = arr[0];
        
        for (int num : arr) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }
        
        return new int[]{min, max};
    }
    
    public static double[] getStats(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        double average = (double) sum / arr.length;
        
        int min = arr[0];
        int max = arr[0];
        for (int num : arr) {
            if (num < min) min = num;
            if (num > max) max = num;
        }
        
        return new double[]{sum, average, min, max};
    }
    
    public static void main(String[] args) {
        int[] numbers = {10, 5, 20, 15, 30};
        
        int[] minMax = getMinMax(numbers);
        System.out.println("Min: " + minMax[0] + ", Max: " + minMax[1]);
        
        double[] stats = getStats(numbers);
        System.out.println("Sum: " + stats[0]);
        System.out.println("Average: " + stats[1]);
        System.out.println("Min: " + stats[2]);
        System.out.println("Max: " + stats[3]);
    }
}
