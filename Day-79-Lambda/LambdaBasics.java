public class LambdaBasics {
    
    public static void main(String[] args) {
        Runnable runnable = () -> System.out.println("Hello from Lambda");
        
        Thread thread = new Thread(runnable);
        thread.start();
        
        Runnable runnable2 = () -> {
            System.out.println("Lambda with multiple statements");
            System.out.println("Line 2");
        };
        
        new Thread(runnable2).start();
    }
}
