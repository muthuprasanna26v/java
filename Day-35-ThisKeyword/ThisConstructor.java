public class ThisConstructor {
    int id;
    String name;
    double salary;
    
    public ThisConstructor(int id, String name) {
        this(id, name, 0);
    }
    
    public ThisConstructor(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    
    public void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
    
    public static void main(String[] args) {
        ThisConstructor obj1 = new ThisConstructor(101, "John");
        ThisConstructor obj2 = new ThisConstructor(102, "Alice", 5000);
        
        System.out.println("Object 1:");
        obj1.display();
        
        System.out.println("\nObject 2:");
        obj2.display();
    }
}
