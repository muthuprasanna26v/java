class Student {
    String name;
    int id;
    
    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }
}

class School {
    String name;
    Student[] students;
    
    public School(String name, Student[] students) {
        this.name = name;
        this.students = students;
    }
    
    public void displayStudents() {
        System.out.println("School: " + name);
        System.out.println("Students:");
        for (Student student : students) {
            System.out.println("  - " + student.name + " (ID: " + student.id + ")");
        }
    }
}

public class SchoolDemo {
    public static void main(String[] args) {
        Student s1 = new Student("John", 101);
        Student s2 = new Student("Alice", 102);
        Student s3 = new Student("Bob", 103);
        
        Student[] students = {s1, s2, s3};
        School school = new School("High School", students);
        
        school.displayStudents();
    }
}
