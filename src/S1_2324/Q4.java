package S1_2324;

import java.util.*;
import java.io.*;

public class Q4 {
    public static void main(String[] args) {
        int[][] seatingPlan = new int[5][5];
        initiliazeSeatingPlan(seatingPlan);
        analyzeSeating(seatingPlan);
        
        System.out.println("");
        
        initiliazeSeatingPlan(seatingPlan);
        analyzeSeating(seatingPlan);
    }
    
    public static void initiliazeSeatingPlan(int[][] seatingPlan) {
        Random r = new Random();
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                seatingPlan[i][j] = r.nextInt(0, 2);
            }
        }
    }
    
    public static void analyzeSeating(int[][] seatingPlan) {
        int occupy = 0;
        int[] occupyRow = new int[5];
        
        for (int i = 0; i < 5; i++) {
            occupyRow[i] = 0;
        }
        
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (seatingPlan[i][j] == 1) {
                    occupy++;
                    occupyRow[i]++;
                }
            }
        }
        
        System.out.println("Total Occupied Seats: " + occupy);
        if ((occupyRow[0] >= occupyRow[1]) && (occupyRow[0] >= occupyRow[2]) && (occupyRow[0] >= occupyRow[3]) && (occupyRow[0] >= occupyRow[4])) {
            System.out.println("Row with Most Occupied Seats: Row 1");
        }
        else if ((occupyRow[1] >= occupyRow[0]) && (occupyRow[1] >= occupyRow[2]) && (occupyRow[1] >= occupyRow[3]) && (occupyRow[1] >= occupyRow[4])) {
            System.out.println("Row with Most Occupied Seats: Row 2");
        }
        else if ((occupyRow[2] >= occupyRow[0]) && (occupyRow[2] >= occupyRow[1]) && (occupyRow[2] >= occupyRow[3]) && (occupyRow[2] >= occupyRow[4])) {
            System.out.println("Row with Most Occupied Seats: Row 3");
        }
        else if ((occupyRow[3] >= occupyRow[0]) && (occupyRow[3] >= occupyRow[1]) && (occupyRow[3] >= occupyRow[2]) && (occupyRow[3] >= occupyRow[4])) {
            System.out.println("Row with Most Occupied Seats: Row 4");
        }
        else {
            System.out.println("Row with Most Occupied Seats: Row 5");
        }
        
        System.out.println("Seating Plan:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <5; j++) {
                System.out.print(seatingPlan[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
