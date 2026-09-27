import java.util.Scanner;

public class CheckTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter first side: ");
        int side1 = scanner.nextInt();
        
        System.out.print("Enter second side: ");
        int side2 = scanner.nextInt();
        
        System.out.print("Enter third side: ");
        int side3 = scanner.nextInt();
        
        if (side1 + side2 > side3 && side2 + side3 > side1 && side1 + side3 > side2) {
            if (side1 == side2 && side2 == side3) {
                System.out.println("Equilateral triangle");
            } else if (side1 == side2 || side2 == side3 || side1 == side3) {
                System.out.println("Isosceles triangle");
            } else {
                System.out.println("Scalene triangle");
            }
        } else {
            System.out.println("Not a valid triangle");
        }
        
        scanner.close();
    }
}
