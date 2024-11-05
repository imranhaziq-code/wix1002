package L4;

import java.util.Scanner;

public class L4Q2 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Enter an integer: ");
        int num = keyboard.nextInt();
        
        int series, sumSeries=0;
        
        for (int i = 1; i <= num; i++){
            sumSeries += (i*(i+1))/2;
        }
        
        System.out.println("Sum of series: "+sumSeries);
    }
}