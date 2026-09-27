public class StaticVsInstance {
    
    static int staticVar = 10;
    int instanceVar = 20;
    
    public static void staticMethod() {
        System.out.println("Static method called");
        System.out.println("Static variable: " + staticVar);
    }
    
    public void instanceMethod() {
        System.out.println("Instance method called");
        System.out.println("Static variable: " + staticVar);
        System.out.println("Instance variable: " + instanceVar);
    }
    
    public static void main(String[] args) {
        staticMethod();
        
        StaticVsInstance obj = new StaticVsInstance();
        obj.instanceMethod();
        
        System.out.println("Static variable via class: " + StaticVsInstance.staticVar);
        System.out.println("Instance variable via object: " + obj.instanceVar);
    }
}
