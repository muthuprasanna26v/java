public class FindOccurrence {
    
    public static int countOccurrences(int[] arr, int target) {
        int count = 0;
        for (int num : arr) {
            if (num == target) {
                count++;
            }
        }
        return count;
    }
    
    public static int[] findAllIndices(int[] arr, int target) {
        int count = countOccurrences(arr, target);
        int[] indices = new int[count];
        int index = 0;
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                indices[index++] = i;
            }
        }
        return indices;
    }
    
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 2, 4, 2, 5};
        
        int target = 2;
        System.out.println("Count of " + target + ": " + countOccurrences(numbers, target));
        
        int[] indices = findAllIndices(numbers, target);
        System.out.print("Indices: ");
        for (int i : indices) {
            System.out.print(i + " ");
        }
    }
}
