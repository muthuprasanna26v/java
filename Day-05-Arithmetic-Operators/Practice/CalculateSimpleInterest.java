public class CalculateSimpleInterest {
    public static void main(String[] args) {
        double principal = 10000;
        double rate = 5;
        double time = 3;
        
        double simpleInterest = (principal * rate * time) / 100;
        double totalAmount = principal + simpleInterest;
        
        System.out.println("Principal: " + principal);
        System.out.println("Rate: " + rate + "%");
        System.out.println("Time: " + time + " years");
        System.out.println("Simple Interest: " + simpleInterest);
        System.out.println("Total Amount: " + totalAmount);
    }
}
