package S1_2324;

import java.io.*;
import java.util.*;

public class Q5 {
    public static void main(String[] args) {
        try {
            String[][] info = new String[4][4];
            Scanner s2 = new Scanner(new FileReader("participants.txt"));
            int j = 0;
            while (s2.hasNextLine()) {
                String line;
                line = s2.nextLine();
                String[] initial = line.split(",");
                
                for (int col = 0; col < 4; col++) {
                    info[j][col] = initial[col].trim();
                }
                j++;
            }
            
            for (int i = 0; i < 4; i++) {
                if (i == 1) {
                    System.out.printf("%-12s%-4s%-4s  %5s", info[i][0], info[i][1], info[i][2], info[i][3]);
                    System.out.println("");
                }
                else{
                    System.out.printf("%-12s%-4s%-4s%5s", info[i][0], info[i][1], info[i][2], info[i][3]);
                    System.out.println("");
                }
            }
            
            int pairCount = 0;
            
            if ((info[0][3].replaceAll(" ", "")).equalsIgnoreCase(info[1][3].replaceAll(" ", ""))) {
                if (!(info[0][1].equalsIgnoreCase(info[1][1]))) {
                    pairCount++;
                }
            }
            if ((info[0][3].replaceAll(" ", "")).equalsIgnoreCase(info[2][3].replaceAll(" ", ""))) {
                if (!(info[0][1].equalsIgnoreCase(info[2][1]))) {
                    pairCount++;
                }
            }
            if ((info[0][3].replaceAll(" ", "")).equalsIgnoreCase(info[3][3].replaceAll(" ", ""))) {
                if (!(info[0][1].equalsIgnoreCase(info[3][1]))) {
                    pairCount++;
                }
            }
            if ((info[1][3].replaceAll(" ", "")).equalsIgnoreCase(info[2][3].replaceAll(" ", ""))) {
                if (!(info[1][1].equalsIgnoreCase(info[2][1]))) {
                    pairCount++;
                }
            }
            if ((info[1][3].replaceAll(" ", "")).equalsIgnoreCase(info[3][3].replaceAll(" ", ""))) {
                if (!(info[1][1].equalsIgnoreCase(info[3][1]))) {
                    pairCount++;
                }
            }
            if ((info[2][3].replaceAll(" ", "")).equalsIgnoreCase(info[3][3].replaceAll(" ", ""))) {
                if (!(info[2][1].equalsIgnoreCase(info[3][1]))) {
                    pairCount++;
                }
            }
           
            if (pairCount == 2) {
                System.out.println("Participants are in pairs.");
                try {
                BufferedWriter bw = new BufferedWriter(new FileWriter("grouping.txt"));
                String seatNameA;
                String seatNameB;
                String seatNameC;
                String seatNameD;
                String ageA;
                String ageB;
                String ageC;
                String ageD;
                
                if ((info[0][3].replaceAll(" ", "")).equalsIgnoreCase(info[1][3].replaceAll(" ", ""))) {
                if (!(info[0][1].equalsIgnoreCase(info[1][1]))) {
                    seatNameA = info[0][0];
                    seatNameB = info[2][0];
                    seatNameC = info[1][0];
                    seatNameD = info[3][0];
                    ageA = info[0][2];
                    ageB = info[2][2];
                    ageC = info[1][2];
                    ageD = info[3][2];
                    
                    System.out.println("Seat A : " + seatNameA +", " + ageA + " years old");
                    System.out.println("Seat B : " + seatNameB +", " + ageB + " years old");
                    System.out.println("Seat C : " + seatNameC +", " + ageC + " years old");
                    System.out.println("Seat D : " + seatNameD +", " + ageD + " years old");
                    
                    bw.write("Seat A : " + seatNameA +", " + ageA + " years old\n");
                    bw.write("Seat B : " + seatNameB +", " + ageB + " years old\n");
                    bw.write("Seat C : " + seatNameC +", " + ageC + " years old\n");
                    bw.write("Seat D : " + seatNameD +", " + ageD + " years old");
                    bw.close();
                }
            }
            if ((info[0][3].replaceAll(" ", "")).equalsIgnoreCase(info[2][3].replaceAll(" ", ""))) {
                if (!(info[0][1].equalsIgnoreCase(info[2][1]))) {
                    seatNameA = info[0][0];
                    seatNameB = info[1][0];
                    seatNameC = info[2][0];
                    seatNameD = info[3][0];
                    ageA = info[0][2];
                    ageB = info[1][2];
                    ageC = info[2][2];
                    ageD = info[3][2];
                    
                    System.out.println("Seat A : " + seatNameA +", " + ageA + " years old");
                    System.out.println("Seat B : " + seatNameB +", " + ageB + " years old");
                    System.out.println("Seat C : " + seatNameC +", " + ageC + " years old");
                    System.out.println("Seat D : " + seatNameD +", " + ageD + " years old");
                    
                    bw.write("Seat A : " + seatNameA +", " + ageA + " years old\n");
                    bw.write("Seat B : " + seatNameB +", " + ageB + " years old\n");
                    bw.write("Seat C : " + seatNameC +", " + ageC + " years old\n");
                    bw.write("Seat D : " + seatNameD +", " + ageD + " years old\n");
                    bw.close();
                }
            }
            
            if ((info[0][3].replaceAll(" ", "")).equalsIgnoreCase(info[3][3].replaceAll(" ", ""))) {
                if (!(info[0][1].equalsIgnoreCase(info[3][1]))) {
                    seatNameA = info[0][0];
                    seatNameB = info[1][0];
                    seatNameC = info[3][0];
                    seatNameD = info[2][0];
                    ageA = info[0][2];
                    ageB = info[1][2];
                    ageC = info[3][2];
                    ageD = info[2][2];
                    
                    System.out.println("Seat A : " + seatNameA +", " + ageA + " years old");
                    System.out.println("Seat B : " + seatNameB +", " + ageB + " years old");
                    System.out.println("Seat C : " + seatNameC +", " + ageC + " years old");
                    System.out.println("Seat D : " + seatNameD +", " + ageD + " years old");
                    
                    bw.write("Seat A : " + seatNameA +", " + ageA + " years old\n");
                    bw.write("Seat B : " + seatNameB +", " + ageB + " years old\n");
                    bw.write("Seat C : " + seatNameC +", " + ageC + " years old\n");
                    bw.write("Seat D : " + seatNameD +", " + ageD + " years old");
                    bw.close();
                }
                
                

                
                
            }
                }
            catch (IOException e) {
                System.out.println("Input Output error.");
            }
            }
            else {
                System.out.println("Participants are not in pairs, cannot proceed.");
            }
            
            
            
        }
        catch (FileNotFoundException e) {
            System.out.println("File Not Found.");
        }
        catch (IOException e) {
            System.out.println("Input Output Error.");
        }
    }
}
