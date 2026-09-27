public class StaticVariable {
    static int count = 0;
    int id;
    
    public StaticVariable() {
        count++;
        id = count;
    }
    
    public void display() {
        System.out.println("ID: " + id);
        System.out.println("Count: " + count);
    }
    
    public static void main(String[] args) {
        StaticVariable obj1 = new StaticVariable();
        StaticVariable obj2 = new StaticVariable();
        StaticVariable obj3 = new StaticVariable();
        
        obj1.display();
        obj2.display();
        obj3.display();
        
        System.out.println("Total objects created: " + StaticVariable.count);
    }
}
