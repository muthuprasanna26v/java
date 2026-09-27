import java.util.Scanner;

public class AreaCalculator {
    
    public static double circleArea(double radius) {
        return 3.14159 * radius * radius;
    }
    
    public static double rectangleArea(double length, double width) {
        return length * width;
    }
    
    public static double triangleArea(double base, double height) {
        return 0.5 * base * height;
    }
    
    public static double squareArea(double side) {
        return side * side;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter radius of circle: ");
        double radius = scanner.nextDouble();
        System.out.println("Area of circle: " + circleArea(radius));
        
        System.out.print("Enter length and width of rectangle: ");
        double length = scanner.nextDouble();
        double width = scanner.nextDouble();
        System.out.println("Area of rectangle: " + rectangleArea(length, width));
        
        System.out.print("Enter base and height of triangle: ");
        double base = scanner.nextDouble();
        double height = scanner.nextDouble();
        System.out.println("Area of triangle: " + triangleArea(base, height));
        
        System.out.print("Enter side of square: ");
        double side = scanner.nextDouble();
        System.out.println("Area of square: " + squareArea(side));
        
        scanner.close();
    }
}
