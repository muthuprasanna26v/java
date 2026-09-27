public class ThreadMethods extends Thread {
    
    public void run() {
        System.out.println("Thread is running");
        
        try {
            Thread.sleep(2000);
            System.out.println("After sleep");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        System.out.println("Thread name: " + getName());
        System.out.println("Thread priority: " + getPriority());
        System.out.println("Thread is alive: " + isAlive());
    }
    
    public static void main(String[] args) throws InterruptedException {
        ThreadMethods thread = new ThreadMethods();
        thread.setName("MyThread");
        thread.setPriority(Thread.MAX_PRIORITY);
        
        System.out.println("Before start - is alive: " + thread.isAlive());
        
        thread.start();
        
        System.out.println("After start - is alive: " + thread.isAlive());
        
        thread.join();
        
        System.out.println("After join - is alive: " + thread.isAlive());
    }
}
