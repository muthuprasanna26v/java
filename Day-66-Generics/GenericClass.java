class Box<T> {
    private T item;
    
    public void set(T item) {
        this.item = item;
    }
    
    public T get() {
        return item;
    }
}

public class GenericClass {
    
    public static void main(String[] args) {
        Box<Integer> integerBox = new Box<>();
        integerBox.set(10);
        System.out.println("Integer: " + integerBox.get());
        
        Box<String> stringBox = new Box<>();
        stringBox.set("Hello");
        System.out.println("String: " + stringBox.get());
        
        Box<Double> doubleBox = new Box<>();
        doubleBox.set(3.14);
        System.out.println("Double: " + doubleBox.get());
    }
}
