package L2;

import java.util.Scanner;

public class L2Q1 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        double fahrenheit;
        System.out.print("Please enter temperature in Fahrenheit: ");
        fahrenheit = keyboard.nextDouble();
        
        double celcius;
        celcius = (fahrenheit-32)/1.8;
        System.out.printf("The temperature is %.2f*C", celcius);
        System.out.println("");
    }
    
}

