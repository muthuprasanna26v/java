import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student {
    String name;
    int marks;
    
    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
    
    @Override
    public String toString() {
        return name + " (" + marks + ")";
    }
}

public class SortStudents {
    
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("John", 85));
        students.add(new Student("Alice", 92));
        students.add(new Student("Bob", 78));
        
        System.out.println("Before sorting: " + students);
        
        Collections.sort(students, (s1, s2) -> s2.marks - s1.marks);
        
        System.out.println("Sorted by marks (descending): " + students);
    }
}
