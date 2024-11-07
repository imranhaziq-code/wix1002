package L4;

import java.util.Scanner;

public class L4Q3 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        int num , n = 0, sum = 0, dsum = 0, min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        
        while(true) {
            System.out.print("Enter a score [negative score to quit]:");
            
            if((num = keyboard.nextInt()) < 0){
                break;
            }
            
            sum += num; 
            dsum += num * num; 
            n++;
            
            if(num < min) {
                min = num;
            }
            
            if(num > max) {
                max = num;
            }
        }

        double avg = sum / n;
        double var = (dsum - (Math.pow(sum, 2) / n)) / (n - 1);
        double std = Math.sqrt(var);
        
        System.out.println("Minimum Score: " + min);
        System.out.println("Maximum Score: " + max);
        System.out.printf("Average Score: %.2f\n", avg);
        System.out.printf("Standard Deviation: %.2f\n ", std);
        }
    }

