class Payment {
    public void processPayment(double amount) {
        System.out.println("Processing payment of $" + amount);
    }
}

class CreditCard extends Payment {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing credit card payment of $" + amount);
    }
}

class PayPal extends Payment {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing PayPal payment of $" + amount);
    }
}

public class PaymentDemo {
    public static void main(String[] args) {
        Payment payment1 = new CreditCard();
        Payment payment2 = new PayPal();
        
        payment1.processPayment(100);
        payment2.processPayment(50);
    }
}
