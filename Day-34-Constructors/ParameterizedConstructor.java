public class ParameterizedConstructor {
    int id;
    String name;
    
    public ParameterizedConstructor(int id, String name) {
        this.id = id;
        this.name = name;
    }
    
    public void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
    }
    
    public static void main(String[] args) {
        ParameterizedConstructor obj = new ParameterizedConstructor(101, "Java");
        obj.display();
    }
}
