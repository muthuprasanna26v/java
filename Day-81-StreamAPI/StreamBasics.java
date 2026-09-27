import java.util.Arrays;
import java.util.List;

public class StreamBasics {
    
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        
        System.out.println("Even numbers:");
        numbers.stream()
               .filter(n -> n % 2 == 0)
               .forEach(System.out::println);
        
        System.out.println("\nSquared numbers:");
        numbers.stream()
               .map(n -> n * n)
               .forEach(System.out::println);
        
        System.out.println("\nNumbers greater than 5:");
        numbers.stream()
               .filter(n -> n > 5)
               .forEach(System.out::println);
    }
}
