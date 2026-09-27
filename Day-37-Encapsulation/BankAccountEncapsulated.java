public class BankAccountEncapsulated {
    private String accountNumber;
    private double balance;
    
    public BankAccountEncapsulated(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    
    public String getAccountNumber() {
        return accountNumber;
    }
    
    public double getBalance() {
        return balance;
    }
    
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid amount");
        }
    }
    
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Invalid amount or insufficient balance");
        }
    }
    
    public static void main(String[] args) {
        BankAccountEncapsulated account = new BankAccountEncapsulated("123456", 1000);
        
        System.out.println("Balance: " + account.getBalance());
        account.deposit(500);
        account.withdraw(200);
        System.out.println("Balance: " + account.getBalance());
    }
}
