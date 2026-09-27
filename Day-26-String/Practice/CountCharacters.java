public class CountCharacters {
    
    public static int countCharacters(String str) {
        return str.length();
    }
    
    public static int countWords(String str) {
        if (str.isEmpty()) {
            return 0;
        }
        String[] words = str.trim().split("\\s+");
        return words.length;
    }
    
    public static void main(String[] args) {
        String text = "Hello World Java";
        
        System.out.println("Text: " + text);
        System.out.println("Character count: " + countCharacters(text));
        System.out.println("Word count: " + countWords(text));
    }
}
