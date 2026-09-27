public class CompileTimePolymorphism {
    
    public int add(int a, int b) {
        return a + b;
    }
    
    public double add(double a, double b) {
        return a + b;
    }
    
    public int add(int a, int b, int c) {
        return a + b + c;
    }
    
    public static void main(String[] args) {
        CompileTimePolymorphism obj = new CompileTimePolymorphism();
        
        System.out.println("add(10, 20): " + obj.add(10, 20));
        System.out.println("add(10.5, 20.5): " + obj.add(10.5, 20.5));
        System.out.println("add(10, 20, 30): " + obj.add(10, 20, 30));
    }
}
