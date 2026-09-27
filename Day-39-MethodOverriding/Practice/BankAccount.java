class Account {
    String accountNumber;
    double balance;
    
    public Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance");
        }
    }
    
    public void display() {
        System.out.println("Account: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
}

class SavingsAccount extends Account {
    double interestRate;
    
    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }
    
    @Override
    public void withdraw(double amount) {
        if (balance - amount >= 100) {
            super.withdraw(amount);
        } else {
            System.out.println("Minimum balance must be 100");
        }
    }
    
    public void addInterest() {
        balance += balance * interestRate / 100;
        System.out.println("Interest added");
    }
}

public class BankAccountDemo {
    public static void main(String[] args) {
        SavingsAccount account = new SavingsAccount("123456", 1000, 5);
        account.display();
        account.addInterest();
        account.display();
        account.withdraw(200);
        account.display();
    }
}
