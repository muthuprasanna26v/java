class Vehicle {
    String brand;
    
    public Vehicle(String brand) {
        this.brand = brand;
    }
    
    public void display() {
        System.out.println("Brand: " + brand);
    }
}

class Car extends Vehicle {
    String model;
    
    public Car(String brand, String model) {
        super(brand);
        this.model = model;
    }
    
    @Override
    public void display() {
        super.display();
        System.out.println("Model: " + model);
    }
}

public class SuperKeyword {
    public static void main(String[] args) {
        Car car = new Car("Toyota", "Camry");
        car.display();
    }
}
