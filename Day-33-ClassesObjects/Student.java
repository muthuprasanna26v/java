public class Student {
    String name;
    int age;
    double marks;
    
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Marks: " + marks);
    }
    
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.name = "John";
        student1.age = 20;
        student1.marks = 85.5;
        
        Student student2 = new Student();
        student2.name = "Alice";
        student2.age = 19;
        student2.marks = 92.0;
        
        System.out.println("Student 1:");
        student1.display();
        
        System.out.println("\nStudent 2:");
        student2.display();
    }
}
