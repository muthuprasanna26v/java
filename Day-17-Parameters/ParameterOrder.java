public class ParameterOrder {
    
    public static void displayInfo(String name, int age, String city) {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("City: " + city);
    }
    
    public static void displayInfo(int age, String name, String city) {
        System.out.println("Age: " + age);
        System.out.println("Name: " + name);
        System.out.println("City: " + city);
    }
    
    public static void main(String[] args) {
        displayInfo("John", 25, "New York");
        System.out.println();
        displayInfo(30, "Alice", "London");
    }
}
