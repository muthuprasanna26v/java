abstract class Person {
    String name;
    int age;
    
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    abstract void display();
}

class Student extends Person {
    double marks;
    
    public Student(String name, int age, double marks) {
        super(name, age);
        this.marks = marks;
    }
    
    @Override
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Marks: " + marks);
    }
}

public class AbstractConstructor {
    public static void main(String[] args) {
        Student student = new Student("John", 20, 85.5);
        student.display();
    }
}
