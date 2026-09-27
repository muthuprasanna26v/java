import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.BiConsumer;

public class BiFunction {
    
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> add = (a, b) -> a + b;
        System.out.println("Addition: " + add.apply(5, 3));
        
        BiPredicate<Integer, Integer> isEqual = (a, b) -> a == b;
        System.out.println("5 == 5: " + isEqual.test(5, 5));
        System.out.println("5 == 3: " + isEqual.test(5, 3));
        
        BiConsumer<String, Integer> printInfo = (name, age) -> {
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
        };
        printInfo.accept("John", 25);
    }
}
