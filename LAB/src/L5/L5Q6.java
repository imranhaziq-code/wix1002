package L5;

import java.util.Scanner;

public class L5Q6 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Enter the number of row of Pascal Triangle to generate: ");
        int size = keyboard.nextInt();
        int[][] matrix = new int[size][size];
        
        System.out.println("The Pascal Triangle with 6 row(s)");
        for (int i = 0; i < size; i++) {
            matrix[i][0] = 1; 
            for (int j = 1; j <= i; j++) {
                matrix[i][j] = matrix[i - 1][j - 1] + matrix[i - 1][j];
            }
        }

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(matrix[i][j] + "  ");
            }
            System.out.println();
        }
    }
  
}
