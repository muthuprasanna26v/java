import java.util.Scanner;

public class NextVsNextLine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a word: ");
        String word = scanner.next();
        System.out.println("Word: " + word);
        
        System.out.print("Enter a sentence: ");
        scanner.nextLine();
        String sentence = scanner.nextLine();
        System.out.println("Sentence: " + sentence);
        
        System.out.print("Enter multiple words: ");
        String line = scanner.nextLine();
        System.out.println("Line: " + line);
        
        scanner.close();
    }
}
