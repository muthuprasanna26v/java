class Animal {
    String name;
    
    public void eat() {
        System.out.println(name + " is eating");
    }
}

class Dog extends Animal {
    public void bark() {
        System.out.println(name + " is barking");
    }
}

class Cat extends Animal {
    public void meow() {
        System.out.println(name + " is meowing");
    }
}

public class HierarchicalInheritance {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.name = "Buddy";
        
        Cat cat = new Cat();
        cat.name = "Whiskers";
        
        dog.eat();
        dog.bark();
        
        cat.eat();
        cat.meow();
    }
}
