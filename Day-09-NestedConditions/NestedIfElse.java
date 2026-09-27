import java.util.Scanner;

public class NestedIfElse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        
        System.out.print("Enter your weight in kg: ");
        int weight = scanner.nextInt();
        
        if (age >= 18) {
            if (weight >= 50) {
                System.out.println("You can donate blood");
            } else {
                System.out.println("You are underweight to donate blood");
            }
        } else {
            System.out.println("You are too young to donate blood");
        }
        
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        if (number > 0) {
            if (number > 100) {
                System.out.println("Large positive number");
            } else {
                System.out.println("Small positive number");
            }
        } else if (number < 0) {
            if (number < -100) {
                System.out.println("Large negative number");
            } else {
                System.out.println("Small negative number");
            }
        } else {
            System.out.println("Number is zero");
        }
        
        scanner.close();
    }
}
