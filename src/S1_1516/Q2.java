package S1_1516;

import java.util.*;
import java.io.*;

public class Q2 {
    public static void main(String[] args) {
        Random r = new Random();
        Scanner s = new Scanner(System.in);
        int userCount = 0;
        int comCount = 0;
        
        while ((userCount < 3) && (comCount < 3)) {
            System.out.print("Enter 1.Paper 2.Scissor 3.Rock: ");
            int inputUser = s.nextInt();
            int inputComputer = r.nextInt(1, 4);
            String gameUser;
            String gameComputer;
            
            if (inputUser == 1) {
                gameUser = "Paper";
            }
            else if (inputUser == 2) {
                gameUser = "Scissor";
            }
            else if (inputUser == 3) {
                gameUser = "Rock";
            }
            else {
                System.out.println("Error.");
                break;
            }
            
            if (inputComputer == 1) {
                gameComputer = "Paper";
            }
            else if (inputComputer == 2) {
                gameComputer = "Scissor";
            }
            else if (inputComputer == 3) {
                gameComputer = "Rock";
            }
            else {
                System.out.println("Error.");
                break;
            }
            
            System.out.println("Player : " + gameUser + " ----- Computer : " + gameComputer);
            
            if (((inputUser == 1) && (inputComputer == 1)) || ((inputUser == 2) && (inputComputer == 2)) || ((inputUser == 3) && (inputComputer == 3))) {
                System.out.println("Draw.");
            }
            else if (inputUser == 3) {
                userCount++;
                System.out.println("Player win " + userCount + " time(s)");
            }
            else if (inputUser == 1) {
                comCount++;
                System.out.println("Computer win " + comCount + " time(s)");
            }
            else if (inputComputer == 3) {
                comCount++;
                System.out.println("Computer win " + comCount + " time(s)");
            }
            else if (inputComputer == 1) {
                userCount++;
                System.out.println("Player win " + userCount + " time(s)");
            }
        }
        
        if (userCount > comCount) {
            System.out.println("Player wins the game.");
        }
        else {
            System.out.println("Computer wins the game.");
        }
    }
}
