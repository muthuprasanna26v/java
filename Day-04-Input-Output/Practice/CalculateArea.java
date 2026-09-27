import java.util.Scanner;

public class CalculateArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter radius of circle: ");
        double radius = scanner.nextDouble();
        
        double area = 3.14159 * radius * radius;
        double circumference = 2 * 3.14159 * radius;
        
        System.out.println("Area: " + area);
        System.out.println("Circumference: " + circumference);
        
        scanner.close();
    }
}
