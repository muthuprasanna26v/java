import java.util.HashSet;

public class HashSetInteger {
    
    public static void main(String[] args) {
        HashSet<Integer> numbers = new HashSet<>();
        
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(20);
        numbers.add(10);
        
        System.out.println("HashSet: " + numbers);
        System.out.println("Size: " + numbers.size());
        
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println("Sum: " + sum);
    }
}
