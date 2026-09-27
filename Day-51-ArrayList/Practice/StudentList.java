import java.util.ArrayList;

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

public class StudentList {
    
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        
        students.add(new Student("John", 20));
        students.add(new Student("Alice", 19));
        students.add(new Student("Bob", 21));
        
        System.out.println("Students: " + students);
        
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
