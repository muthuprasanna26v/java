public class VariableScope {
    int instanceVar = 10;
    
    static int staticVar = 20;
    
    public static void main(String[] args) {
        int localVar = 30;
        
        System.out.println("Local Variable: " + localVar);
        System.out.println("Static Variable: " + staticVar);
        
        {
            int blockVar = 40;
            System.out.println("Block Variable: " + blockVar);
        }
        
        for (int i = 0; i < 5; i++) {
            System.out.println("Loop variable i: " + i);
        }
    }
    
    public void methodExample() {
        System.out.println("Instance Variable: " + instanceVar);
        System.out.println("Static Variable: " + staticVar);
    }
}
