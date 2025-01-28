package L2;

import java.util.Scanner;
import java.text.DecimalFormat;
import java.text.NumberFormat;


public class L2Q6 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        NumberFormat scientificFormat = new DecimalFormat("0.######E0");
        
        System.out.print("Enter the amount of water in gram: ");
        double gram = keyboard.nextDouble();
        double M = gram/1000;
        
        System.out.print("Enter the initial temperature in Fahrenheit: ");
        double initial_temp = keyboard.nextDouble();
        double initial_temp_c = (initial_temp-32)/1.8;
        
        System.out.print("Enter the final temperature in Fahrenheit: ");
        double final_temp = keyboard.nextDouble();
        double final_temp_c = (final_temp-32)/1.8;
        
        
        Double Q = M*(final_temp_c-initial_temp_c)*4184;
        String scientificNotation = scientificFormat.format(Q);
        
        System.out.println("The energy needed is "+scientificNotation);
    }
    
}