abstract class BankAccount {
    String accountNumber;
    double balance;
    
    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    
    abstract void calculateInterest();
    
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }
    
    public void display() {
        System.out.println("Account: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
}

class SavingsAccount extends BankAccount {
    double interestRate;
    
    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }
    
    @Override
    void calculateInterest() {
        double interest = balance * interestRate / 100;
        balance += interest;
        System.out.println("Interest added: " + interest);
    }
}

public class BankAccountAbstract {
    public static void main(String[] args) {
        SavingsAccount account = new SavingsAccount("123456", 1000, 5);
        account.display();
        account.calculateInterest();
        account.display();
    }
}
