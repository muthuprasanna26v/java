public class Parameters {
    
    public static void printValue(int value) {
        System.out.println("Value: " + value);
    }
    
    public static void printSum(int a, int b) {
        System.out.println("Sum: " + (a + b));
    }
    
    public static void printDetails(String name, int age, double salary) {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
    }
    
    public static void printArray(int[] arr) {
        System.out.print("Array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        printValue(10);
        
        printSum(5, 15);
        
        printDetails("John", 25, 50000.50);
        
        int[] numbers = {1, 2, 3, 4, 5};
        printArray(numbers);
    }
}
