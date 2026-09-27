import java.io.File;

public class FileBasics {
    
    public static void main(String[] args) {
        File file = new File("test.txt");
        
        System.out.println("File exists: " + file.exists());
        System.out.println("Is file: " + file.isFile());
        System.out.println("Is directory: " + file.isDirectory());
        System.out.println("Absolute path: " + file.getAbsolutePath());
        System.out.println("Name: " + file.getName());
        System.out.println("Parent: " + file.getParent());
        System.out.println("Size: " + file.length() + " bytes");
    }
}
