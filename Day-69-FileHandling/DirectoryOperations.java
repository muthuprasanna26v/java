import java.io.File;

public class DirectoryOperations {
    
    public static void main(String[] args) {
        File dir = new File("testdir");
        
        if (!dir.exists()) {
            if (dir.mkdir()) {
                System.out.println("Directory created");
            } else {
                System.out.println("Failed to create directory");
            }
        }
        
        File nestedDir = new File("testdir/nested");
        if (nestedDir.mkdirs()) {
            System.out.println("Nested directories created");
        }
        
        System.out.println("Is directory: " + dir.isDirectory());
        System.out.println("Files in directory:");
        File[] files = dir.listFiles();
        if (files != null) {
            for (File f : files) {
                System.out.println(f.getName());
            }
        }
        
        if (dir.delete()) {
            System.out.println("Directory deleted");
        }
    }
}
