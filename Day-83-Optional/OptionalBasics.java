import java.util.Optional;

public class OptionalBasics {
    
    public static void main(String[] args) {
        Optional<String> optional1 = Optional.of("Hello");
        System.out.println("Value: " + optional1.get());
        
        Optional<String> optional2 = Optional.empty();
        System.out.println("Is present: " + optional2.isPresent());
        
        Optional<String> optional3 = Optional.ofNullable(null);
        System.out.println("Is present: " + optional3.isPresent());
        
        Optional<String> optional4 = Optional.ofNullable("Java");
        optional4.ifPresent(value -> System.out.println("Value: " + value));
        
        String result = optional4.orElse("Default");
        System.out.println("Result: " + result);
    }
}
