public class ReverseString {
    
    public static String reverse(String str) {
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        return reversed;
    }
    
    public static void main(String[] args) {
        String original = "Java";
        String reversed = reverse(original);
        
        System.out.println("Original: " + original);
        System.out.println("Reversed: " + reversed);
    }
}
