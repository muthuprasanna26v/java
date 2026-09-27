import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamOperations {
    
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        
        long count = numbers.stream().filter(n -> n % 2 == 0).count();
        System.out.println("Count of even numbers: " + count);
        
        Optional<Integer> max = numbers.stream().max(Integer::compare);
        System.out.println("Max: " + max.orElse(0));
        
        Optional<Integer> min = numbers.stream().min(Integer::compare);
        System.out.println("Min: " + min.orElse(0));
        
        int sum = numbers.stream().mapToInt(Integer::intValue).sum();
        System.out.println("Sum: " + sum);
        
        double average = numbers.stream().mapToInt(Integer::intValue).average().orElse(0);
        System.out.println("Average: " + average);
    }
}
