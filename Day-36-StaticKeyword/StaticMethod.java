public class StaticMethod {
    static int x = 10;
    int y = 20;
    
    public static void staticMethod() {
        System.out.println("Static method");
        System.out.println("x: " + x);
    }
    
    public void instanceMethod() {
        System.out.println("Instance method");
        System.out.println("x: " + x);
        System.out.println("y: " + y);
    }
    
    public static void main(String[] args) {
        StaticMethod.staticMethod();
        
        StaticMethod obj = new StaticMethod();
        obj.instanceMethod();
    }
}
