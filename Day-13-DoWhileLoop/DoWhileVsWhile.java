public class DoWhileVsWhile {
    public static void main(String[] args) {
        int i = 6;
        
        System.out.println("While loop (condition checked first):");
        while (i <= 5) {
            System.out.println("i = " + i);
            i++;
        }
        System.out.println("While loop ended without execution");
        
        int j = 6;
        
        System.out.println("Do-while loop (executed at least once):");
        do {
            System.out.println("j = " + j);
            j++;
        } while (j <= 5);
        System.out.println("Do-while loop executed once");
        
        int count = 0;
        do {
            System.out.println("Count: " + count);
            count++;
        } while (count < 3);
    }
}
