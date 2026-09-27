class Shape {
    String color;
    
    public Shape(String color) {
        this.color = color;
    }
    
    public void displayColor() {
        System.out.println("Color: " + color);
    }
}

class Circle extends Shape {
    double radius;
    
    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }
    
    public double area() {
        return 3.14159 * radius * radius;
    }
    
    public void display() {
        displayColor();
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + area());
    }
}

class Rectangle extends Shape {
    double length;
    double width;
    
    public Rectangle(String color, double length, double width) {
        super(color);
        this.length = length;
        this.width = width;
    }
    
    public double area() {
        return length * width;
    }
    
    public void display() {
        displayColor();
        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
        System.out.println("Area: " + area());
    }
}

public class ShapeDemo {
    public static void main(String[] args) {
        Circle circle = new Circle("Red", 5);
        circle.display();
        
        Rectangle rectangle = new Rectangle("Blue", 10, 5);
        rectangle.display();
    }
}
