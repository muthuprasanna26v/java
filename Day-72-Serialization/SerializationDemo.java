import java.io.Serializable;

class Employee implements Serializable {
    private static final long serialVersionUID = 1L;
    String name;
    int id;
    double salary;
    
    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
    
    @Override
    public String toString() {
        return "Employee{name='" + name + "', id=" + id + ", salary=" + salary + "}";
    }
}

public class SerializationDemo {
    
    public static void main(String[] args) {
        Employee emp = new Employee("John", 101, 50000);
        System.out.println("Employee object: " + emp);
        
        System.out.println("Employee is Serializable: " + (emp instanceof java.io.Serializable));
    }
}
