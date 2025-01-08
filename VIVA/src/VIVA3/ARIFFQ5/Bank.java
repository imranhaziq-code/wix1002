package VIVA3.ARIFFQ5;

import java.util.ArrayList;

public class Bank {
    String bankName;
    ArrayList<Customer> customers;
    
   public Bank(String bankName){
       this.bankName = bankName;
   }
   
   public void addCustomer(Customer customer){
     if (customers == null) {
        customers = new ArrayList<>();
    }
    customers.add(customer);
    System.out.println("Creating a new customer: " + customer.getname()+ " (ID: " + customer.getcustomerId() + ")");
}
   
   
   public Customer getCustomer(String customerId){
    for (Customer customer: customers){
        if (customer.getcustomerId().equals(customerId)){
            return customer;
        }
    }
       return null;
   }
   
   public void displayAllcustomers(){
       System.out.println("Displaying all customer of " + bankName + ":");
       for (Customer customer : customers){
           System.out.println("Customer: " + customer.getname() + ", ID " + customer.getcustomerId());
       }
   } 
}
