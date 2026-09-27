public class StaticBlock {
    static int x;
    int y;
    
    static {
        System.out.println("Static block");
        x = 10;
    }
    
    {
        System.out.println("Instance block");
        y = 20;
    }
    
    public StaticBlock() {
        System.out.println("Constructor");
    }
    
    public static void main(String[] args) {
        System.out.println("Main method");
        StaticBlock obj1 = new StaticBlock();
        StaticBlock obj2 = new StaticBlock();
    }
}
