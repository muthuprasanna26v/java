import java.util.HashMap;

public class WordCount {
    
    public static void main(String[] args) {
        String text = "java is great java is powerful java is easy";
        
        String[] words = text.split(" ");
        
        HashMap<String, Integer> wordCount = new HashMap<>();
        
        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }
        
        System.out.println("Word count: " + wordCount);
    }
}
