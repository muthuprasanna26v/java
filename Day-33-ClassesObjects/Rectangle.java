public class Rectangle {
    double length;
    double width;
    
    public double area() {
        return length * width;
    }
    
    public double perimeter() {
        return 2 * (length + width);
    }
    
    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle();
        rect1.length = 5;
        rect1.width = 3;
        
        Rectangle rect2 = new Rectangle();
        rect2.length = 10;
        rect2.width = 4;
        
        System.out.println("Rectangle 1:");
        System.out.println("Area: " + rect1.area());
        System.out.println("Perimeter: " + rect1.perimeter());
        
        System.out.println("\nRectangle 2:");
        System.out.println("Area: " + rect2.area());
        System.out.println("Perimeter: " + rect2.perimeter());
    }
}
