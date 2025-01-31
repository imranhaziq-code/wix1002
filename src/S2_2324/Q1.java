package S2_2324;

import java.util.*;
import java.io.*;

public class Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int gameNumber = 1;

        while (scanner.hasNextLine()) {
            char[][] board = new char[3][3];
            boolean hasEmpty = false;

            // Read 3x3 board
            for (int i = 0; i < 3; i++) {
                String line = scanner.nextLine();
                for (int j = 0; j < 3; j++) {
                    board[i][j] = line.charAt(j);
                    if (board[i][j] == '.') hasEmpty = true;
                }
            }

            // Get winner result
            String winner = checkWinner(board, hasEmpty);

            // Print output
            System.out.println("Game " + gameNumber + ":");
            System.out.println("Tic-Tac-Toe Board:");
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print(board[i][j] == '.' ? " " : board[i][j]);
                    if (j < 2) System.out.print(" ");
                }
                System.out.println();
            }
            System.out.println("Winner: " + winner);
            System.out.println(); // Blank line for readability

            gameNumber++;

            // Read separator "#" and continue to the next game
            if (scanner.hasNextLine() && scanner.nextLine().equals("#")) {
                continue;
            } else {
                break;
            }
        }

        scanner.close();
    }

    static String checkWinner(char[][] b, boolean hasEmpty) {
        for (int i = 0; i < 3; i++) {
            if (b[i][0] != '.' && b[i][0] == b[i][1] && b[i][1] == b[i][2]) return String.valueOf(b[i][0]); // Row
            if (b[0][i] != '.' && b[0][i] == b[1][i] && b[1][i] == b[2][i]) return String.valueOf(b[0][i]); // Column
        }
        if (b[0][0] != '.' && b[0][0] == b[1][1] && b[1][1] == b[2][2]) return String.valueOf(b[0][0]); // Diagonal \
        if (b[0][2] != '.' && b[0][2] == b[1][1] && b[1][1] == b[2][0]) return String.valueOf(b[0][2]); // Diagonal /

        return hasEmpty ? "None (on going)" : "Draw";
    }
}
