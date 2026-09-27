public class StudentEncapsulated {
    private String name;
    private int age;
    private double marks;
    
    public StudentEncapsulated(String name, int age, double marks) {
        this.name = name;
        this.age = age;
        this.marks = marks;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public int getAge() {
        return age;
    }
    
    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        }
    }
    
    public double getMarks() {
        return marks;
    }
    
    public void setMarks(double marks) {
        if (marks >= 0 && marks <= 100) {
            this.marks = marks;
        }
    }
    
    public char getGrade() {
        if (marks >= 90) return 'A';
        if (marks >= 80) return 'B';
        if (marks >= 70) return 'C';
        if (marks >= 60) return 'D';
        return 'F';
    }
    
    public static void main(String[] args) {
        StudentEncapsulated student = new StudentEncapsulated("John", 20, 85);
        
        System.out.println("Name: " + student.getName());
        System.out.println("Grade: " + student.getGrade());
    }
}
