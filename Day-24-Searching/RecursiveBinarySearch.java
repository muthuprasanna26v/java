public class BinarySearchRecursive {
    
    public static int binarySearch(int[] arr, int target, int left, int right) {
        if (left > right) {
            return -1;
        }
        
        int mid = left + (right - left) / 2;
        
        if (arr[mid] == target) {
            return mid;
        }
        
        if (arr[mid] < target) {
            return binarySearch(arr, target, mid + 1, right);
        }
        
        return binarySearch(arr, target, left, mid - 1);
    }
    
    public static void main(String[] args) {
        int[] sortedArray = {2, 5, 8, 12, 16, 23, 38, 56, 72, 91};
        
        int target = 56;
        int index = binarySearch(sortedArray, target, 0, sortedArray.length - 1);
        
        if (index != -1) {
            System.out.println(target + " found at index " + index);
        } else {
            System.out.println(target + " not found");
        }
    }
}
