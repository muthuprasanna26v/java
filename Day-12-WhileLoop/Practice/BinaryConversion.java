import java.util.Scanner;

public class BinaryConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a decimal number: ");
        int decimal = scanner.nextInt();
        
        String binary = "";
        int temp = decimal;
        
        if (temp == 0) {
            binary = "0";
        } else {
            while (temp > 0) {
                int remainder = temp % 2;
                binary = remainder + binary;
                temp /= 2;
            }
        }
        
        System.out.println("Binary of " + decimal + ": " + binary);
        
        scanner.close();
    }
}
