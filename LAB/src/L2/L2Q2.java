package l2q2;

import java.util.Scanner;

public class L2Q2 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        double P;
        double D;
        double R;
        int Y;
        double M;
        
        System.out.print("Please enter the price of the car($): ");
        P = keyboard.nextDouble();
        
        System.out.print("Please enter the down payment($): ");
        D = keyboard.nextDouble();
        
        System.out.print("Please enter the interest rate(%): ");
        R = keyboard.nextDouble();
        
        System.out.print("Please enter the loan duration(year): ");
        Y = keyboard.nextInt();
        System.out.println("");
        
        M = (P-D)*(1+R*Y/100)/(Y*12);
        
        System.out.printf("The montly payment: %.2f$" , M);
        System.out.println("");
    }
    
}
