package L4;

import java.util.Random;

public class L4Q5 {
    public static void main(String[] args) {
        Random g = new Random();
        
        int min = 1;
        int max = 7;
        int totalPlayer1 = 0;
        int totalPlayer2 = 0;
        int i = 1;
        int j = 1;
        
        while ((totalPlayer1 <= 100) && (totalPlayer2 <= 100)){
            int player1 = g.nextInt(min, max);
            totalPlayer1 += player1;
            System.out.println("Player 1 roll "+i+": "+player1);
            i++;
            if (player1 == 6){
                player1 = g.nextInt(min, max);
                totalPlayer1 += player1;
                System.out.println("Player 1 roll "+i+": "+player1);
                i++;
            }
            else{
                int player2 = g.nextInt(min, max);
                totalPlayer2 += player2;
                System.out.println("Player 2 roll "+j+": "+player2);
                j++;
                if (player2 == 6){
                    player2 = g.nextInt(min, max);
                    totalPlayer2 += player2;
                    System.out.println("Player 2 roll "+j+": "+player2);
                    j++;
                }
                else{
                    
                }
            }
        }
       
        System.out.println("");
        System.out.println("Player 1 total score: "+totalPlayer1);
        System.out.println("Player 2 total score: "+totalPlayer2);
        
        if (totalPlayer1 > totalPlayer2){
            System.out.println("Player 1 wins!");
        }
        else if (totalPlayer1 == totalPlayer2){
            System.out.println("Draw.");
        }
        else{
            System.out.println("Player 2 wins!");
        }
    }
}
