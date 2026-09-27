public class VarArgs {
    
    public static void printNumbers(int... numbers) {
        System.out.println("Number of arguments: " + numbers.length);
        System.out.print("Numbers: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
    
    public static int sum(int... numbers) {
        int total = 0;
        for (int num : numbers) {
            total += num;
        }
        return total;
    }
    
    public static double average(double... numbers) {
        if (numbers.length == 0) {
            return 0;
        }
        double total = 0;
        for (double num : numbers) {
            total += num;
        }
        return total / numbers.length;
    }
    
    public static void main(String[] args) {
        printNumbers(1, 2, 3);
        printNumbers(10, 20, 30, 40, 50);
        printNumbers();
        
        System.out.println("Sum of 1, 2, 3: " + sum(1, 2, 3));
        System.out.println("Sum of 10, 20, 30, 40: " + sum(10, 20, 30, 40));
        
        System.out.println("Average of 1, 2, 3, 4, 5: " + average(1, 2, 3, 4, 5));
        System.out.println("Average of 10, 20, 30: " + average(10, 20, 30));
    }
}
