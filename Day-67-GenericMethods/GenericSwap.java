public class GenericSwap {
    
    public static <T> void swap(T[] array, int i, int j) {
        T temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
    
    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        String[] strArray = {"A", "B", "C", "D"};
        
        System.out.println("Before swap: " + java.util.Arrays.toString(intArray));
        swap(intArray, 0, 4);
        System.out.println("After swap: " + java.util.Arrays.toString(intArray));
        
        System.out.println("Before swap: " + java.util.Arrays.toString(strArray));
        swap(strArray, 0, 3);
        System.out.println("After swap: " + java.util.Arrays.toString(strArray));
    }
}
