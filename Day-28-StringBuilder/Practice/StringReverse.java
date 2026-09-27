public class StringReverse {
    
    public static String reverse(String str) {
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }
    
    public static void main(String[] args) {
        String original = "Java Programming";
        String reversed = reverse(original);
        
        System.out.println("Original: " + original);
        System.out.println("Reversed: " + reversed);
    }
}
