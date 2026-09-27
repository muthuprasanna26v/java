public class CompareTo {
    
    public static void main(String[] args) {
        String[] words = {"Apple", "Banana", "Cherry", "Date"};
        
        System.out.println("Before sorting:");
        for (String word : words) {
            System.out.println(word);
        }
        
        for (int i = 0; i < words.length - 1; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if (words[i].compareTo(words[j]) > 0) {
                    String temp = words[i];
                    words[i] = words[j];
                    words[j] = temp;
                }
            }
        }
        
        System.out.println("\nAfter sorting:");
        for (String word : words) {
            System.out.println(word);
        }
    }
}
