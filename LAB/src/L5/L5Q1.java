package L5;

import java.util.Random;
import java.util.Scanner;

public class L5Q1 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        Random rand = new Random();
        
        System.out.print("Please enter the number of students: ");
        int N = keyboard.nextInt();
        
        int[] scores = new int[N];
        int sum = 0;
        
        System.out.println("\nScores for each students:");
        for (int i = 0; i < scores.length; i++){
            scores[i] = rand.nextInt(101);
            System.out.println("Score for student " + i + "  -  " + scores[i]);
            sum += scores[i];
        }
        
        int highestScore = Integer.MIN_VALUE;
        int lowestScore = Integer.MAX_VALUE;
        double avg = (double)sum / scores.length;
        
        for (int j = 0; j < scores.length; j++){
            if (scores[j] > highestScore){
                highestScore = scores[j];
            }
            else if (scores [j] < lowestScore){
                lowestScore = scores[j];
            }
            else{
                continue;
            }
        }
        
        System.out.println("\nThe highest score: " + highestScore);
        System.out.println("The lowest score: " + lowestScore);
        System.out.println("Average score: " + avg);
    }
}
