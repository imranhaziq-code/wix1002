package L6;

import java.util.Random;
import java.util.Scanner;

public class L6Q5 {
    
    static int MultiplicationGame(int a, int b, int c) {
            if ((a * b) == c){
                return 1;
            }
        return 0;
    }
    
    public static void main(String[] args) {
        Random g = new Random();
        Scanner keyboard = new Scanner(System.in);
        int num1;
        int num2;
        int answer;
        int score = 0;
        
        while(true){
            System.out.println("Enter a negative number to quit.");
            num1 = g.nextInt(13);
            num2 = g.nextInt(13);
            System.out.print(num1 + " x " + num2 + " = ");
            answer = keyboard.nextInt();
            if (answer < 0){
                break;
            }
            score += MultiplicationGame(num1, num2, answer);
        }
        System.out.println("Your score is " + score);
        
    }
}
