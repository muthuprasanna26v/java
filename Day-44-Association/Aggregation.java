class Department {
    String name;
    
    public Department(String name) {
        this.name = name;
    }
}

class Employee {
    String name;
    Department department;
    
    public Employee(String name, Department department) {
        this.name = name;
        this.department = department;
    }
    
    public void display() {
        System.out.println("Employee: " + name);
        System.out.println("Department: " + department.name);
    }
}

public class Aggregation {
    public static void main(String[] args) {
        Department dept = new Department("IT");
        Employee emp = new Employee("John", dept);
        
        emp.display();
    }
}
