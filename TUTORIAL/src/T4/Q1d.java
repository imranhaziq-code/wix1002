package T4;

import java.util.Scanner;

public class Q1d {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        int sum = 0;
        System.out.print("Please enter a number: ");
        int num = keyboard.nextInt();
        
        for (int i = 1; i <= num ; i++){
            sum+=i;
        }
        
        System.out.println("Sum of number until given number: "+sum);
    }
}
