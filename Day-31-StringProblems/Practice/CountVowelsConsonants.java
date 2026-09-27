public class CountVowelsConsonants {
    
    public static int countVowels(String str) {
        int count = 0;
        str = str.toLowerCase();
        
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        return count;
    }
    
    public static int countConsonants(String str) {
        int count = 0;
        str = str.toLowerCase();
        
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z' && 
                !(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')) {
                count++;
            }
        }
        return count;
    }
    
    public static void main(String[] args) {
        String text = "Java Programming";
        
        System.out.println("Text: " + text);
        System.out.println("Vowels: " + countVowels(text));
        System.out.println("Consonants: " + countConsonants(text));
    }
}
