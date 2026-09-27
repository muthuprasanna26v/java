public class BankAccount {
    String accountNumber;
    String accountHolder;
    double balance;
    
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
        System.out.println("New balance: " + balance);
    }
    
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
            System.out.println("New balance: " + balance);
        } else {
            System.out.println("Insufficient balance");
        }
    }
    
    public void displayBalance() {
        System.out.println("Account: " + accountNumber);
        System.out.println("Holder: " + accountHolder);
        System.out.println("Balance: " + balance);
    }
    
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.accountNumber = "123456789";
        account.accountHolder = "John Doe";
        account.balance = 1000.0;
        
        account.displayBalance();
        account.deposit(500);
        account.withdraw(200);
        account.displayBalance();
    }
}
