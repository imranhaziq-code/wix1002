package L8;


public class L8Q2 {
    public static void main(String[] args) {
        // Create a new bank account with an initial deposit
        BankAccount account1 = new BankAccount("John Doe", "051212140606", 1500.00);

        // Display account information
        account1.displayAccountInfo();

        System.out.println();

        // Deposit money into the account
        account1.deposit(500.00);
        account1.displayBalance();

        System.out.println();

        // Withdraw money from the account
        account1.withdraw(300.00);
        account1.displayBalance();

        System.out.println();

        // Attempt to withdraw more money than available in the account
        account1.withdraw(2000.00);
        account1.displayBalance();
    }
}

class BankAccount {
    private String name;
    private String idNumber;
    private double balance;
    
    public BankAccount(String name, String idNumber, double depositAmount) {
        this.name = name;
        this.idNumber = idNumber;
        this.balance = depositAmount;
    }
    
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Deposit must be postive.");
        }
    }
    
    public void withdraw(double amount) {
        if ((amount > 0) && (amount <= balance)) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else if (amount < 0) {
            System.out.println("Withdrawal must be positive.");
        } else {
            System.out.println("Insufficient balance.");
        }
    }
    
    public void displayBalance() {
        System.out.println("Current balance: " + balance);
    }
    
    public void displayAccountInfo() {
            System.out.println("Account Holder: " + name);
            System.out.println("ID/Passport Number: " + idNumber);
            displayBalance();
    }
}
