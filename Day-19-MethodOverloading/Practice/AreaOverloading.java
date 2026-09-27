public class AreaOverloading {
    
    public static double area(double radius) {
        return 3.14159 * radius * radius;
    }
    
    public static double area(double length, double width) {
        return length * width;
    }
    
    public static double area(double base, double height, boolean isTriangle) {
        if (isTriangle) {
            return 0.5 * base * height;
        }
        return base * height;
    }
    
    public static void main(String[] args) {
        System.out.println("Circle area (r=5): " + area(5));
        System.out.println("Rectangle area (5x10): " + area(5, 10));
        System.out.println("Triangle area (b=5, h=10): " + area(5, 10, true));
    }
}
