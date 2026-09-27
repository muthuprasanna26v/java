public class GenericMethods {
    
    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
    
    public static <T extends Comparable<T>> T findMax(T[] array) {
        T max = array[0];
        for (T element : array) {
            if (element.compareTo(max) > 0) {
                max = element;
            }
        }
        return max;
    }
    
    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        String[] strArray = {"Apple", "Banana", "Cherry"};
        
        System.out.print("Integer array: ");
        printArray(intArray);
        
        System.out.print("String array: ");
        printArray(strArray);
        
        System.out.println("Max integer: " + findMax(intArray));
        System.out.println("Max string: " + findMax(strArray));
    }
}
