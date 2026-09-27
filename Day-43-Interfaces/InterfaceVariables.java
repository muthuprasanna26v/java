interface Constants {
    double PI = 3.14159;
    int MAX_SIZE = 100;
    String DEFAULT_NAME = "Unknown";
}

public class InterfaceVariables implements Constants {
    public static void main(String[] args) {
        System.out.println("PI: " + PI);
        System.out.println("MAX_SIZE: " + MAX_SIZE);
        System.out.println("DEFAULT_NAME: " + DEFAULT_NAME);
    }
}
