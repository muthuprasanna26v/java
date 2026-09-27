public class ReverseString {
    
    public static String reverse(String str) {
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        return reversed;
    }
    
    public static boolean isPalindrome(String str) {
        String reversed = reverse(str);
        return str.equals(reversed);
    }
    
    public static void main(String[] args) {
        String original = "Java";
        String reversed = reverse(original);
        System.out.println("Original: " + original);
        System.out.println("Reversed: " + reversed);
        
        String word1 = "madam";
        String word2 = "hello";
        System.out.println("Is 'madam' palindrome? " + isPalindrome(word1));
        System.out.println("Is 'hello' palindrome? " + isPalindrome(word2));
    }
}
