public class CopyConstructor {
    int id;
    String name;
    
    public CopyConstructor(int id, String name) {
        this.id = id;
        this.name = name;
    }
    
    public CopyConstructor(CopyConstructor obj) {
        this.id = obj.id;
        this.name = obj.name;
    }
    
    public void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
    }
    
    public static void main(String[] args) {
        CopyConstructor obj1 = new CopyConstructor(101, "John");
        CopyConstructor obj2 = new CopyConstructor(obj1);
        
        System.out.println("Original object:");
        obj1.display();
        
        System.out.println("\nCopied object:");
        obj2.display();
    }
}
