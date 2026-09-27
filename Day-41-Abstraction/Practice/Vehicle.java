abstract class Vehicle {
    String brand;
    String model;
    
    public Vehicle(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }
    
    abstract void start();
    abstract void stop();
    
    public void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
    }
}

class Car extends Vehicle {
    public Car(String brand, String model) {
        super(brand, model);
    }
    
    @Override
    void start() {
        System.out.println(brand + " " + model + " starts with key");
    }
    
    @Override
    void stop() {
        System.out.println(brand + " " + model + " stops with brake");
    }
}

public class VehicleDemo {
    public static void main(String[] args) {
        Car car = new Car("Toyota", "Camry");
        car.display();
        car.start();
        car.stop();
    }
}
