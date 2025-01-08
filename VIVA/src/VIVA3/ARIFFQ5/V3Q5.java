package VIVA3.ARIFFQ5;

public class V3Q5 {
    public static void main(String[] args) {
        Bank bank = new Bank("bankrakyat");
        System.out.println("Welcome to " + bank.bankName + "!");
        Customer customer = new Customer( " Ariff", "C112");
        bank.addCustomer(customer);
        
        BankAccount account = new BankAccount("A1001", "Ariff", 500.0);
        customer.addAccount(account);

        
        account.deposit(200.0);
        System.out.println("New balance: " + account.getBalance());
        account.withdraw(100.0);
        System.out.println("New balance: " + account.getBalance());
        
        System.out.println("Displaying all accounts for customer " + account.getaccountHolderName() + ":");

        
        customer.displayAccounts();

        bank.displayAllcustomers();
    }
}
