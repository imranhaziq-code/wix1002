package VIVA1;

import java.util.Scanner;

public class V1Q6 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        int maxScore = Integer.MIN_VALUE;
        int secondMaxScore = Integer.MIN_VALUE;
        int maxCount = 0;
        int secondMaxCount = 0;
        int totalSum = 0;
        boolean hasNegative = false;
        
        System.out.print("Enter numbers: ");
        
        while (true) {
            int score = keyboard.nextInt();
            
            if (score == 0) 
                break;
            
            totalSum += score;
            
            if (score < 0) 
                hasNegative = true;
            
            if (score > maxScore) {
                secondMaxScore = maxScore;
                secondMaxCount = maxCount;
                maxScore = score;
                maxCount = 1;
            } else if (score == maxScore) {
                maxCount++;
            } else if (score > secondMaxScore) {
                secondMaxScore = score;
                secondMaxCount = 1;
            } else if (score == secondMaxScore) {
                secondMaxCount++;
            }
        }
        
        System.out.println("The largest number is " +maxScore);
        System.out.println("The occurrence count of the largest number is " +maxCount);

        System.out.println("The second-largest number is " +secondMaxScore);
        System.out.println("The occurrence count of the second-largest number is " +secondMaxCount);

        System.out.println("The total sum of all numbers is " + totalSum);
            
        if (hasNegative) {
            System.out.println("Negative numbers were entered.");
        } else {
            System.out.println("No negative numbers were entered.");
        }
    }
}