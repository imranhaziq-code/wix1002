package L8;

import java.util.Random;

public class L8Q5 {
    public static void main(String[] args) {
        Game game = new Game("Imran", "Haziq");
        game.displayWinner();
    }
}

class Game {
    private String user1;
    private String user2;
    
    public Game(String user1, String user2) {
        this.user1 = user1;
        this.user2 = user2;
    }
    
    public void calculateWinner() {
       Random rand = new Random();
       
       int user1Score = 0;
       int user2Score = 0;
       int i = 0;
       
       while ((user1Score < 100) && (user2Score < 100)) {
           user1Score += rand.nextInt(7);
           user2Score += rand.nextInt(7);
           ++i;
           System.out.println("Round " + i + " (" + user1 + "): " + user1Score);
           System.out.println("Round " + i + " (" + user2 + "): " + user2Score);
           System.out.println("");
       }
       
       
       if (user1Score > user2Score) {
           System.out.println("Winner is " + user1 + " with " + user1Score + " points.");
       } else if (user1Score == user2Score) {
           System.out.println("Ties.");
       } else {
           System.out.println("Winner is " + user2 + " with " + user2Score + " points.");
       }
    }
    
    public void displayWinner() {
        System.out.println("User 1: " + user1);
        System.out.println("User 2: " + user2);
        calculateWinner();
    }
}