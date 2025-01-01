package L9;

import java.util.Random;
import java.util.Scanner;

public class L9Q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose a Dice Game:");
        System.out.println("1. Two Dice Game");
        System.out.println("2. Single Dice Game");
        int choice = scanner.nextInt();

        DiceGame game;
        if (choice == 1) {
            game = new TwoDiceGame();
        } else if (choice == 2) {
            game = new SingleDiceGame();
        } else {
            System.out.println("Invalid choice.");
            return;
        }

        System.out.println("Starting the game. First player to reach 100 points wins!");
        game.resetScore();

        while (true) {
            System.out.println("\nPress Enter to roll the dice...");
            scanner.nextLine();
            int roundScore = game instanceof TwoDiceGame ? ((TwoDiceGame) game).play() : ((SingleDiceGame) game).play();

            // If adding the round score exceeds 100, score is not counted
            if (game.score + roundScore > 100) {
                System.out.println("Score exceeded 100! Last roll not counted.");
            } else {
                game.score += roundScore;
            }

            System.out.println("Current score: " + game.score);

            if (game.score >= 100) {
                System.out.println("Congratulations! You've won the game with a score of " + game.score + "!");
                break;
            }
        }
    }
}

class DiceGame {
    protected Random random = new Random();
        protected int score;

        public DiceGame() {
            this.score = 0;
        }

        public void resetScore() {
            this.score = 0;
        }

        public int rollDice() {
            return random.nextInt(6) + 1; // Dice roll between 1 and 6
        }
}

class TwoDiceGame extends DiceGame {
    public int play() {
            int dice1 = rollDice();
            int dice2 = rollDice();
            System.out.println("Rolled: Dice 1 = " + dice1 + ", Dice 2 = " + dice2);

            if (dice1 == dice2) {
                System.out.println("Both dice are equal. Rolling again...");
            }
            return dice1 + dice2; // Return score of the roll
        }
}

class SingleDiceGame extends DiceGame {
    public int play() {
            int firstRoll = rollDice();
            System.out.println("First roll: " + firstRoll);

            if (firstRoll == 6) {
                System.out.println("Rolled a 6! Rolling again...");
                int secondRoll = rollDice();
                System.out.println("Second roll: " + secondRoll);

                if (secondRoll == 6) {
                    System.out.println("Rolled 6 twice! No score this turn.");
                    return 0;
                }
                return firstRoll + secondRoll; // Add both rolls
            }
            return firstRoll; // Return the first roll
        }
}