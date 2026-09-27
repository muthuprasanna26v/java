public class FindDuplicates {
    
    public static void printDuplicates(int[] arr) {
        System.out.println("Duplicate elements:");
        
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.print(arr[i] + " ");
                    break;
                }
            }
        }
    }
    
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 2, 4, 5, 3, 6, 1};
        
        printDuplicates(numbers);
    }
}
