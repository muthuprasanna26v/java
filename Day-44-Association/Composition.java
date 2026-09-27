class Engine {
    String type;
    int horsepower;
    
    public Engine(String type, int horsepower) {
        this.type = type;
        this.horsepower = horsepower;
    }
    
    public void start() {
        System.out.println("Engine started");
    }
}

class Car {
    String make;
    String model;
    Engine engine;
    
    public Car(String make, String model, String type, int horsepower) {
        this.make = make;
        this.model = model;
        this.engine = new Engine(type, horsepower);
    }
    
    public void startCar() {
        engine.start();
        System.out.println(make + " " + model + " started");
    }
}

public class Composition {
    public static void main(String[] args) {
        Car car = new Car("Toyota", "Camry", "V6", 268);
        car.startCar();
    }
}
