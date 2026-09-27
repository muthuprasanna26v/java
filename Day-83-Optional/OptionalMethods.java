import java.util.Optional;

public class OptionalMethods {
    
    public static void main(String[] args) {
        Optional<String> optional = Optional.of("Java");
        
        System.out.println("isPresent: " + optional.isPresent());
        System.out.println("isEmpty: " + optional.isEmpty());
        
        optional.ifPresent(value -> System.out.println("Value: " + value));
        
        String value = optional.get();
        System.out.println("get: " + value);
        
        String orElse = optional.orElse("Default");
        System.out.println("orElse: " + orElse);
        
        String orElseGet = optional.orElseGet(() -> "Generated Default");
        System.out.println("orElseGet: " + orElseGet);
    }
}
