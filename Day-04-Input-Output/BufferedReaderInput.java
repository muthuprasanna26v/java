import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BufferedReaderInput {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.print("Enter your name: ");
        String name = reader.readLine();
        
        System.out.print("Enter your age: ");
        String ageStr = reader.readLine();
        int age = Integer.parseInt(ageStr);
        
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        
        reader.close();
    }
}
