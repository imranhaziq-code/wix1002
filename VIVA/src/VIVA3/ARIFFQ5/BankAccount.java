package VIVA3.ARIFFQ5;

public class BankAccount {
    String accountNumber;
    String accountHolderName;
    private double balance = 0.00;
    
    public BankAccount(String accountNumber, String accountHolderName,double depositamount){
      this.accountHolderName = accountHolderName;
      this.accountNumber = accountNumber;
      this.balance = depositamount;
    }
    
    public void deposit(double amount){
        if (amount > 0){
            balance += amount;
            System.out.println("Depositing " + amount + " into account " + accountNumber + "....");
        }else {
            System.out.println("Invalid input : negaative amount");   
        }
    }
    
    public boolean withdraw(double amount){
        if ( amount > 0 && amount < balance){
            balance -= amount;
            System.out.println("Withdrawing " + amount + " from account " + accountNumber + "....");
            return true;
        }else{
            System.out.println("baki tidak mencukupi");
            return false;
        }
    }
    
    public String getaccountNumber(){
    return accountNumber; 
}
    public String getaccountHolderName(){
        return accountHolderName;
    }
    
    public double getBalance(){
        return balance;
    }
}
