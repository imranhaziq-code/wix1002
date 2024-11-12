package L5;

import java.util.Scanner;
import java.util.Random;

public class L5Q3 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        Random rand = new Random();
        
        System.out.print("Enter the number of employees: ");
        int numEmployees = keyboard.nextInt();
        
        int[][] workHours = new int[numEmployees][7];
        
        for (int i = 0; i < numEmployees; i++) {
            for (int j = 0; j < 7; j++) {
                workHours[i][j] = rand.nextInt(1,9);
            }
        }
        
        System.out.println("\nWork Hours for Each Employee:");
        
        for (int i = 0; i < numEmployees; i++) {
            int totalHours = 0;
            System.out.print("Employee " + (i + 1) + ": ");
            
            for (int j = 0; j < 7; j++) {
                System.out.print(workHours[i][j] + " ");
                totalHours += workHours[i][j];
            }
            
            System.out.println(" | Total Hours: " + totalHours);
        }
    }
}
