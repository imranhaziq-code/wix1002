package L5;

import java.util.Random;

public class L5Q4 {
    public static void main(String[] args) {
        Random rand = new Random();
        
        int[][] matrix = new int[3][3];
        
        System.out.println("3 by 3 Matrix");
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                matrix[i][j] = rand.nextInt(10);
                System.out.print(matrix[i][j] + "  ");
                
                if (j == 2){
                    System.out.println("");
                }
            }
        }
        
        System.out.println("After rotates 90 degree clockwise");
        for (int i = 0; i < 3; i++){
            for (int j = 2; j >= 0; j--){
                System.out.print(matrix[j][i] + "  ");
                if (j == 0){
                    System.out.println("");
                }
            }
        }
    }
}
