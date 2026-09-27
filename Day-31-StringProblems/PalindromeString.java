public class PalindromeString {
    
    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;
        
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    
    public static void main(String[] args) {
        String word1 = "madam";
        String word2 = "hello";
        
        System.out.println("Is 'madam' palindrome? " + isPalindrome(word1));
        System.out.println("Is 'hello' palindrome? " + isPalindrome(word2));
    }
}
