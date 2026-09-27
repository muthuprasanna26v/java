public class MultiCatch {
    
    public static void main(String[] args) {
        try {
            int[] arr = new int[5];
            arr[10] = 30 / 0;
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught exception: " + e);
        }
        
        try {
            String str = null;
            System.out.println(str.length());
        } catch (NullPointerException | ArithmeticException e) {
            System.out.println("Caught: " + e);
        }
    }
}
