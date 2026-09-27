public class EncapsulationDemo {
    private String name;
    private int age;
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public int getAge() {
        return age;
    }
    
    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Invalid age");
        }
    }
    
    public static void main(String[] args) {
        EncapsulationDemo obj = new EncapsulationDemo();
        obj.setName("John");
        obj.setAge(25);
        
        System.out.println("Name: " + obj.getName());
        System.out.println("Age: " + obj.getAge());
        
        obj.setAge(-5);
    }
}
