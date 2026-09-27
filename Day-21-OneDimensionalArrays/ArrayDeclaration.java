public class ArrayDeclaration {
    
    public static void main(String[] args) {
        int[] numbers = new int[5];
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        numbers[3] = 40;
        numbers[4] = 50;
        
        System.out.println("Array elements:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("numbers[" + i + "] = " + numbers[i]);
        }
        
        int[] values = {1, 2, 3, 4, 5};
        System.out.println("\nValues array:");
        for (int value : values) {
            System.out.println(value);
        }
        
        double[] decimals = new double[]{1.1, 2.2, 3.3};
        System.out.println("\nDecimals array:");
        for (double d : decimals) {
            System.out.println(d);
        }
        
        String[] names = {"John", "Alice", "Bob"};
        System.out.println("\nNames array:");
        for (String name : names) {
            System.out.println(name);
        }
    }
}
