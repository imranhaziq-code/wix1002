package L3;

import java.util.Scanner;

public class L3Q3 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Please enter the sales volume($): ");
        double sales = keyboard.nextDouble();
        double comms;
        
        if(sales <= 100){
            comms = 0.05*sales;
        }
        else if((sales > 100) && (sales <= 500)){
            comms = 0.075*sales;
        }
        else if((sales >500) && (sales <= 1000)){
            comms = 0.1*sales;
        }
        else{
            comms = 0.125*sales;
        }
        
        System.out.printf("Total commission: %.2f$\n", comms);
    }
}
