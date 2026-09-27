public class Person {
    String name;
    int age;
    
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    
    public void display() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
    }
    
    public static void main(String[] args) {
        Person person = new Person("John", 25);
        person.display();
        person.setAge(26);
        person.display();
    }
}
