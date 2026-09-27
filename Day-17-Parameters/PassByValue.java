public class PassByValue {
    
    public static void modifyPrimitive(int num) {
        num = num * 2;
        System.out.println("Inside method: " + num);
    }
    
    public static void modifyArray(int[] arr) {
        arr[0] = 100;
        System.out.println("Inside method: arr[0] = " + arr[0]);
    }
    
    public static void main(String[] args) {
        int number = 10;
        System.out.println("Before method: " + number);
        modifyPrimitive(number);
        System.out.println("After method: " + number);
        
        System.out.println();
        
        int[] array = {1, 2, 3};
        System.out.println("Before method: array[0] = " + array[0]);
        modifyArray(array);
        System.out.println("After method: array[0] = " + array[0]);
    }
}
