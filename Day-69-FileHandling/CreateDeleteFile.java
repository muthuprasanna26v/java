import java.io.File;
import java.io.IOException;

public class CreateDeleteFile {
    
    public static void main(String[] args) {
        File file = new File("newfile.txt");
        
        try {
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists");
            }
        } catch (IOException e) {
            System.out.println("An error occurred");
            e.printStackTrace();
        }
        
        System.out.println("File exists: " + file.exists());
        
        if (file.delete()) {
            System.out.println("File deleted");
        } else {
            System.out.println("Failed to delete file");
        }
    }
}
