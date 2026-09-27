abstract class Animal {
    String name;
    
    public Animal(String name) {
        this.name = name;
    }
    
    public void sleep() {
        System.out.println(name + " is sleeping");
    }
    
    abstract void makeSound();
}

class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }
    
    @Override
    void makeSound() {
        System.out.println(name + " barks");
    }
}

public class AbstractWithConcrete {
    public static void main(String[] args) {
        Dog dog = new Dog("Buddy");
        dog.sleep();
        dog.makeSound();
    }
}
