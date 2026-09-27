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

class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }
    
    @Override
    void makeSound() {
        System.out.println(name + " meows");
    }
}

public class AbstractClass {
    public static void main(String[] args) {
        Dog dog = new Dog("Buddy");
        Cat cat = new Cat("Whiskers");
        
        dog.sleep();
        dog.makeSound();
        
        cat.sleep();
        cat.makeSound();
    }
}
