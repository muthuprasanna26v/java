public class Countdown {
    public static void main(String[] args) {
        int count = 10;
        
        System.out.println("Countdown:");
        while (count >= 0) {
            System.out.println(count);
            count--;
        }
        System.out.println("Liftoff!");
    }
}
