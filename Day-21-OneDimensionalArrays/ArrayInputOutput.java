import java.util.Scanner;

public class ArrayInputOutput {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter array size: ");
        int size = scanner.nextInt();
        
        int[] arr = new int[size];
        
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        
        System.out.println("Array elements:");
        for (int i = 0; i < size; i++) {
            System.out.println("arr[" + i + "] = " + arr[i]);
        }
        
        System.out.print("Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        
        scanner.close();
    }
}
