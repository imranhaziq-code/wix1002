package T3;

import java.util.Scanner;

public class T3Q4 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Enter first integer: ");
        int num1 = keyboard.nextInt();
        System.out.print("Enter second integer: ");
        int num2 = keyboard.nextInt();
        System.out.print("Enter third integer: ");
        int num3 = keyboard.nextInt();
        
        int largest; 

        if (num1 >= num2 && num1 >= num3) {
            largest = num1; 
        } else if (num2 >= num1 && num2 >= num3) {
            largest = num2; 
        } else {
            largest = num3; 
        }

        System.out.println("The largest number is: " + largest);
    }
    
}
