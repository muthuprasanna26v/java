import java.util.ArrayList;

public class ArrayListBasics {
    
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        
        System.out.println("ArrayList: " + list);
        System.out.println("Size: " + list.size());
        System.out.println("Element at index 1: " + list.get(1));
        
        list.set(1, "Blueberry");
        System.out.println("After set: " + list);
        
        list.remove(0);
        System.out.println("After remove: " + list);
        
        System.out.println("Contains Banana: " + list.contains("Banana"));
        System.out.println("Index of Cherry: " + list.indexOf("Cherry"));
        
        list.clear();
        System.out.println("After clear: " + list);
        System.out.println("Is empty: " + list.isEmpty());
    }
}
