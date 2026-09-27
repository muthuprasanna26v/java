class Address {
    String city;
    String state;
    String zipCode;
    
    public Address(String city, String state, String zipCode) {
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }
    
    public void display() {
        System.out.println(city + ", " + state + " - " + zipCode);
    }
}

class Person {
    String name;
    Address address;
    
    public Person(String name, Address address) {
        this.name = name;
        this.address = address;
    }
    
    public void display() {
        System.out.println("Name: " + name);
        System.out.print("Address: ");
        address.display();
    }
}

public class Association {
    public static void main(String[] args) {
        Address address = new Address("New York", "NY", "10001");
        Person person = new Person("John", address);
        
        person.display();
    }
}
