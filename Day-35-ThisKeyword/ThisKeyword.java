public class ThisKeyword {
    int id;
    String name;
    
    public ThisKeyword(int id, String name) {
        this.id = id;
        this.name = name;
    }
    
    public void display() {
        System.out.println("ID: " + this.id);
        System.out.println("Name: " + this.name);
    }
    
    public ThisKeyword getThis() {
        return this;
    }
    
    public static void main(String[] args) {
        ThisKeyword obj = new ThisKeyword(101, "Java");
        obj.display();
        
        ThisKeyword obj2 = obj.getThis();
        System.out.println("Same object: " + (obj == obj2));
    }
}
