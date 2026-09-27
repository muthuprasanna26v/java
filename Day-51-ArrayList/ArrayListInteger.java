import java.util.ArrayList;

public class ArrayListInteger {
    
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        
        System.out.println("Numbers: " + numbers);
        
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println("Sum: " + sum);
        
        int max = numbers.get(0);
        for (int num : numbers) {
            if (num > max) {
                max = num;
            }
        }
        System.out.println("Max: " + max);
        
        numbers.remove(Integer.valueOf(30));
        System.out.println("After removing 30: " + numbers);
    }
}
