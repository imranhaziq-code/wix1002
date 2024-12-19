package VIVA2;

import java.util.Scanner;

public class V2Q1 {
    //method to check balance
    public static void checkBalance(){
        System.out.print("Current balance: ");
    }
    //method to deposit money limited to 1 parameter
    public static double deposit(double amount){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter amount to deposit: ");
        amount = s.nextDouble();
        return amount;
    }
    //method to withdraw money limited to 1 parameter
    public static double withdraw (double amount){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter amount to wihdraw: RM");
        amount = s.nextDouble();
        return amount;
    }
    //method to print transaction
    public static void printTransactions(){
        System.out.println("Transaction History:");
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Welcome to the Bank!");
        double bal = 1000.00; //assume balance is RM1000.00
        double amount,temp,sumdep = 0,sumwith = 0;
        /*amount to deposit or withdraw
        temp to hold amount while compute method
        sumdep to track total deposited money
        sumwith to track total withdrew money*/
        int option = 0;
        do{
            amount = 0;
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. View Transaction History");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            option = s.nextInt();
            switch (option) {
                case 1:
                    checkBalance();
                    System.out.printf("%.2f\n",bal);
                    break;
                case 2:
                    temp = deposit(amount);
                    bal += temp;
                    sumdep += temp;
                    System.out.printf("Your balance is now: %.2f\n" , bal);
                    break;
                case 3:
                    temp = withdraw(amount);
                    if((bal-temp<0))
                        System.out.println("Not enough balance");//withdrawal cant be done
                    else{
                        bal -= temp;
                        sumwith += temp;
                        System.out.printf("Your balance is now: RM %.2f\n" , bal);
                    }   break;
                case 4:
                    printTransactions();
                    System.out.printf("Deposited: RM%.2f\n",sumdep);
                    System.out.printf("Withdrew: RM%.2f\n",sumwith);
                    break;
            }
            System.out.println(" ");
        }while(option != 5);//if option 5, the loop will break
        System.out.println("Thank you for using our banking system!");
        System.out.printf("Your final balance is: RM%.2f\n",bal);
    }
}
