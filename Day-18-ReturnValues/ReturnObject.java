class Student {
    String name;
    int age;
    double marks;
    
    public Student(String name, int age, double marks) {
        this.name = name;
        this.age = age;
        this.marks = marks;
    }
}

public class ReturnObject {
    
    public static Student createStudent(String name, int age, double marks) {
        return new Student(name, age, marks);
    }
    
    public static Student getTopStudent() {
        return new Student("John", 20, 95.5);
    }
    
    public static void main(String[] args) {
        Student student1 = createStudent("Alice", 18, 88.5);
        System.out.println("Name: " + student1.name);
        System.out.println("Age: " + student1.age);
        System.out.println("Marks: " + student1.marks);
        
        Student topStudent = getTopStudent();
        System.out.println("\nTop Student:");
        System.out.println("Name: " + topStudent.name);
        System.out.println("Age: " + topStudent.age);
        System.out.println("Marks: " + topStudent.marks);
    }
}
