public class Box {
    double width;
    double height;
    double depth;
    
    public Box() {
        width = height = depth = 0;
    }
    
    public Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }
    
    public Box(Box obj) {
        width = obj.width;
        height = obj.height;
        depth = obj.depth;
    }
    
    public double volume() {
        return width * height * depth;
    }
    
    public static void main(String[] args) {
        Box box1 = new Box();
        Box box2 = new Box(10, 20, 30);
        Box box3 = new Box(box2);
        
        System.out.println("Volume of box1: " + box1.volume());
        System.out.println("Volume of box2: " + box2.volume());
        System.out.println("Volume of box3: " + box3.volume());
    }
}
