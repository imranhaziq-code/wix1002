package S1_1718;

import java.io.*;
import java.util.*;

public class Q4 {
    public static void main(String[] args) {
        try {
            Scanner s1 = new Scanner(new FileReader("Q4.txt"));
            Scanner s2 = new Scanner(new FileReader("Q4.txt"));
            int i = 0;
            double difficulty = 5.0;
            
            while (s1.hasNextLine()) {
                s1.nextLine();
                i++;
            }
            
            
            String[] name = new String[i];
            double[] marks = new double[5];
            int h = 0;
            double[] totalMarks = new double[i];
            double winner = Double.MIN_VALUE;
            String winnerName = "";
            
            while (s2.hasNextLine()) {
                String temp = s2.nextLine();
                String[] line = temp.split(",");

                double max = Double.MIN_VALUE;
                double min = Double.MAX_VALUE;
                
                name[h] = line[0];
                
                for (int k = 0; k < i; k++) {
                    totalMarks[k] = 0.0;
                }
                
                for (int k = 0; k < marks.length; k++) {
                    marks[k] = Double.parseDouble(line[k+1]);
                    totalMarks[h] += marks[k];
                }
                
                for (int k = 0; k < 5; k++) {
                    if (marks[k] > max) {
                        max = marks[k];
                    }
                    if (marks[k] < min) {
                        min = marks[k];
                    }
                }
                
                totalMarks[h] = (totalMarks[h] - max - min) * difficulty;
                System.out.println(name[h] + " score " + totalMarks[h]);
                h++;
            }
            
            for (int k = 0; k < i; k++) {
                if (totalMarks[k] > winner) {
                    winnerName = name[k];
                }
            }
            
            System.out.println(winnerName + " is the winner");
        }
        catch(FileNotFoundException e) {
            System.out.println("File not found.");
        }
    }
}
