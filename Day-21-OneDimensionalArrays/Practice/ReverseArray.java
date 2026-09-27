public class ReverseArray {
    
    public static int[] reverse(int[] arr) {
        int[] reversed = new int[arr.length];
        int index = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            reversed[index++] = arr[i];
        }
        return reversed;
    }
    
    public static void main(String[] args) {
        int[] original = {1, 2, 3, 4, 5};
        int[] reversed = reverse(original);
        
        System.out.print("Original: ");
        for (int num : original) {
            System.out.print(num + " ");
        }
        
        System.out.print("\nReversed: ");
        for (int num : reversed) {
            System.out.print(num + " ");
        }
    }
}
