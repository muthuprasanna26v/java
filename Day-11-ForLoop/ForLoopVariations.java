public class ForLoopVariations {
    public static void main(String[] args) {
        int i = 1;
        for (; i <= 5; i++) {
            System.out.println("i = " + i);
        }
        
        int j = 1;
        for (; j <= 5;) {
            System.out.println("j = " + j);
            j++;
        }
        
        for (int k = 1, l = 10; k <= 5 && l >= 6; k++, l--) {
            System.out.println("k = " + k + ", l = " + l);
        }
        
        for (; ; ) {
            System.out.println("Infinite loop");
            break;
        }
        
        int count = 0;
        for (; count < 5; ) {
            System.out.println("Count: " + count);
            count++;
        }
    }
}
