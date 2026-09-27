public class CountLettersDigits {
    
    public static int countLetters(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isLetter(str.charAt(i))) {
                count++;
            }
        }
        return count;
    }
    
    public static int countDigits(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                count++;
            }
        }
        return count;
    }
    
    public static int countSpaces(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isWhitespace(str.charAt(i))) {
                count++;
            }
        }
        return count;
    }
    
    public static void main(String[] args) {
        String text = "Java 123 Programming";
        
        System.out.println("Text: " + text);
        System.out.println("Letters: " + countLetters(text));
        System.out.println("Digits: " + countDigits(text));
        System.out.println("Spaces: " + countSpaces(text));
    }
}
