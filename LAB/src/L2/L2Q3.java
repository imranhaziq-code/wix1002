package L2;

import java.util.Random;

public class L2Q3 {
    public static void main(String[] args) {
        Random g = new Random();
        
        int min = 10;
        int max = 50;
        double num1;
        double num2;
        double num3;
        double sum;
        double avg;
        
        num1 = g.nextDouble(min,max);
        num2 = g.nextDouble(min,max);
        num3 = g.nextDouble(min,max);
        sum = num1+num2+num3;
        avg = sum/3;
        
        System.out.printf("Random Number 1: %.2f", num1);
        System.out.println("");
        System.out.printf("Random Number 2: %.2f", num2);
        System.out.println("");
        System.out.printf("Random Number 3: %.2f", num3);
        System.out.println("");
        System.out.printf("Sum of 3 Random Numbers: %.2f", sum);
        System.out.println("");
        System.out.printf("Average of 3 Random Numbers: %.2f", avg);
        System.out.println("");
        
    }
    
}
