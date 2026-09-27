import java.util.ArrayList;
import java.util.Collections;

class Student implements Comparable<Student> {
    String name;
    int age;
    
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    @Override
    public int compareTo(Student other) {
        return this.age - other.age;
    }
    
    @Override
    public String toString() {
        return name + " (" + age + ")";
    }
}

public class ComparableDemo {
    
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("John", 25));
        students.add(new Student("Alice", 20));
        students.add(new Student("Bob", 30));
        
        System.out.println("Before sorting: " + students);
        
        Collections.sort(students);
        
        System.out.println("After sorting by age: " + students);
    }
}
