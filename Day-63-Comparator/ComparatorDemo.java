import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student {
    String name;
    int age;
    
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    @Override
    public String toString() {
        return name + " (" + age + ")";
    }
}

public class ComparatorDemo {
    
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("John", 25));
        students.add(new Student("Alice", 20));
        students.add(new Student("Bob", 30));
        
        System.out.println("Before sorting: " + students);
        
        Collections.sort(students, (s1, s2) -> s1.age - s2.age);
        System.out.println("Sorted by age: " + students);
        
        Collections.sort(students, (s1, s2) -> s1.name.compareTo(s2.name));
        System.out.println("Sorted by name: " + students);
        
        Collections.sort(students, Comparator.comparingInt(s -> s.age));
        System.out.println("Sorted by age (method reference): " + students);
    }
}
