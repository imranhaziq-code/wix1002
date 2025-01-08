package VIVA3.ARIFFQ5;

import java.util.ArrayList;

public class Customer {
    String name;
    String customerId;
    ArrayList<BankAccount> accounts;
    
    public Customer(String name,String customerId ){
        this.customerId = customerId;
        this.name = name;
        this.accounts = new ArrayList<>();       
    }
    
    public void addAccount(BankAccount account){
      accounts.add(account);
        System.out.println("Adding savings account for " + account.accountHolderName + " with account number " + account.getaccountNumber() + " and initial deposit of " + account.getBalance());
    }
   
    BankAccount getAccount(String accountNumber){
        for(BankAccount account : accounts){
            if( account.getaccountNumber().equals(accountNumber)){
                return account;
            }
        }
        return null;
    }
    
    public String getname(){
        return name;
    }
    
    public String getcustomerId(){
        return customerId;
    }
    
    public void displayAccounts(){
        for(BankAccount account : accounts){
            System.out.println("Account number: " + account.getaccountNumber() + " , " + account.getBalance());
        }
    }
}
