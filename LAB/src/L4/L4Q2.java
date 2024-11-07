package L4;

import java.util.Scanner;

public class L4Q2 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Enter an integer: ");
        int num = keyboard.nextInt();
        
        int sum1 = 0, sum2 = 0;
        
        for (int i = 0; i <= num; i++){
            for (int j = 0; j < i; j++){
                sum2 += j;
            }
            sum1 += i;
        }
        
        System.out.println("Sum of series: "+(sum1 + sum2));
    }
}