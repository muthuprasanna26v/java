public class Employee {
    int id;
    String name;
    double salary;
    String department;
    
    public void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Department: " + department);
    }
    
    public double calculateAnnualSalary() {
        return salary * 12;
    }
    
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.id = 101;
        emp.name = "Alice";
        emp.salary = 5000;
        emp.department = "IT";
        
        emp.display();
        System.out.println("Annual Salary: " + emp.calculateAnnualSalary());
    }
}
