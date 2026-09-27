import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {
    
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("output.txt");
            
            writer.write("Hello, World!");
            writer.write("\nThis is a test file.");
            writer.write("\nJava File Handling");
            
            writer.close();
            System.out.println("File written successfully");
        } catch (IOException e) {
            System.out.println("An error occurred");
            e.printStackTrace();
        }
    }
}
