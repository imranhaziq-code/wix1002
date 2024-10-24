package l2q5;

import java.util.Random;

public class L2Q5 {
    public static void main(String[] args) {
        Random g = new Random();
        int min = 0;
        int max = 10000;
        int num = g.nextInt(min,max);
        int sum = 0;
        double digit;
        
        System.out.println("The Random Number: "+num);
        
        while (num>0){
        digit = num%10;
        sum += digit;
        num /= 10;
    }
        System.out.println("Sum of digits: "+sum);
        
    }
    
}
