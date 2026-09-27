import java.util.function.Predicate;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.function.Function;

public class FunctionalInterfaces {
    
    public static void main(String[] args) {
        Predicate<Integer> isEven = n -> n % 2 == 0;
        System.out.println("Is 10 even: " + isEven.test(10));
        System.out.println("Is 7 even: " + isEven.test(7));
        
        Consumer<String> printer = str -> System.out.println(str);
        printer.accept("Hello Consumer");
        
        Supplier<Double> randomSupplier = () -> Math.random();
        System.out.println("Random value: " + randomSupplier.get());
        
        Function<Integer, String> intToString = num -> "Number: " + num;
        System.out.println(intToString.apply(100));
        
        Function<String, Integer> stringLength = str -> str.length();
        System.out.println("Length: " + stringLength.apply("Hello"));
    }
}
