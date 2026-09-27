public class ConstructorDemo {
    String name;
    int age;
    
    public ConstructorDemo() {
        name = "Unknown";
        age = 0;
    }
    
    public ConstructorDemo(String name) {
        this.name = name;
        this.age = 0;
    }
    
    public ConstructorDemo(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
    
    public static void main(String[] args) {
        ConstructorDemo obj1 = new ConstructorDemo();
        ConstructorDemo obj2 = new ConstructorDemo("John");
        ConstructorDemo obj3 = new ConstructorDemo("Alice", 25);
        
        System.out.println("Object 1:");
        obj1.display();
        
        System.out.println("\nObject 2:");
        obj2.display();
        
        System.out.println("\nObject 3:");
        obj3.display();
    }
}
