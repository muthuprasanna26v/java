public class CharacterMethods {
    
    public static void main(String[] args) {
        char ch1 = 'A';
        char ch2 = 'a';
        char ch3 = '5';
        char ch4 = ' ';
        
        System.out.println("isDigit('A'): " + Character.isDigit(ch1));
        System.out.println("isDigit('5'): " + Character.isDigit(ch3));
        
        System.out.println("isLetter('A'): " + Character.isLetter(ch1));
        System.out.println("isLetter('5'): " + Character.isLetter(ch3));
        
        System.out.println("isLetterOrDigit('A'): " + Character.isLetterOrDigit(ch1));
        System.out.println("isLetterOrDigit(' '): " + Character.isLetterOrDigit(ch4));
        
        System.out.println("isUpperCase('A'): " + Character.isUpperCase(ch1));
        System.out.println("isLowerCase('a'): " + Character.isLowerCase(ch2));
        
        System.out.println("toUpperCase('a'): " + Character.toUpperCase(ch2));
        System.out.println("toLowerCase('A'): " + Character.toLowerCase(ch1));
        
        System.out.println("isWhitespace(' '): " + Character.isWhitespace(ch4));
    }
}
