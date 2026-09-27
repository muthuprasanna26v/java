import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Collect {
    
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        
        List<Integer> evenNumbers = numbers.stream()
                                           .filter(n -> n % 2 == 0)
                                           .collect(Collectors.toList());
        
        System.out.println("Even numbers: " + evenNumbers);
        
        List<Integer> squared = numbers.stream()
                                      .map(n -> n * n)
                                      .collect(Collectors.toList());
        
        System.out.println("Squared: " + squared);
        
        String joined = numbers.stream()
                              .map(String::valueOf)
                              .collect(Collectors.joining(", "));
        
        System.out.println("Joined: " + joined);
    }
}
