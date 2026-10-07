package S1_1819;

import java.io.*;
import java.util.*;

public class Q4 {
    public static void main(String[] args) {
        try {
            Scanner s1 = new Scanner(new FileReader("myAmbition.txt"));
            Scanner s2 = new Scanner(new FileReader("myAmbition.txt"));
            
            System.out.println("The essay is :");
            while (s1.hasNextLine()) {
                System.out.println(s1.nextLine());
            }
            
            System.out.println("");
            
            int sentenceCount = 0;
            int wordCount = 1;
            int countA = 0;
            int countB = 0;
            int countC = 0;
            int countD = 0;
            int countE = 0;
            int countF = 0;
            int countG = 0;
            int countH = 0;
            int countI = 0;
            int countJ = 0;
            int countK = 0;
            int countL = 0;
            int countM = 0;
            int countN = 0;
            int countO = 0;
            int countP = 0;
            int countQ = 0;
            int countR = 0;
            int countS = 0;
            int countT = 0;
            int countU = 0;
            int countW = 0;
            int countX = 0;
            int countY = 0;
            int countZ = 0;
            int countV = 0;
            
            while (s2.hasNextLine()) {
                String line = s2.nextLine();
                for (int i = 0; i < line.length(); i++) {
                    if ((line.charAt(i) == 'a') || (line.charAt(i) == 'A')) {
                        countA++;
                    }
                    else if ((line.charAt(i) == 'b') || (line.charAt(i) == 'B')) {
                        countB++;
                    }
                    else if ((line.charAt(i) == 'c') || (line.charAt(i) == 'C')) {
                        countC++;
                    }
                    else if ((line.charAt(i) == 'd') || (line.charAt(i) == 'D')) {
                        countD++;
                    }
                    else if ((line.charAt(i) == 'e') || (line.charAt(i) == 'E')) {
                        countE++;
                    }
                    else if ((line.charAt(i) == 'f') || (line.charAt(i) == 'F')) {
                        countF++;
                    }
                    else if ((line.charAt(i) == 'g') || (line.charAt(i) == 'G')) {
                        countG++;
                    }
                    else if ((line.charAt(i) == 'h') || (line.charAt(i) == 'H')) {
                        countH++;
                    }
                    else if ((line.charAt(i) == 'i') || (line.charAt(i) == 'I')) {
                        countI++;
                    }
                    else if ((line.charAt(i) == 'j') || (line.charAt(i) == 'J')) {
                        countJ++;
                    }
                    else if ((line.charAt(i) == 'k') || (line.charAt(i) == 'K')) {
                        countK++;
                    }
                    else if ((line.charAt(i) == 'l') || (line.charAt(i) == 'L')) {
                        countL++;
                    }
                    else if ((line.charAt(i) == 'm') || (line.charAt(i) == 'M')) {
                        countM++;
                    }
                    else if ((line.charAt(i) == 'n') || (line.charAt(i) == 'N')) {
                        countN++;
                    }
                    else if ((line.charAt(i) == 'o') || (line.charAt(i) == 'O')) {
                        countO++;
                    }
                    else if ((line.charAt(i) == 'q') || (line.charAt(i) == 'Q')) {
                        countQ++;
                    }
                    else if ((line.charAt(i) == 'r') || (line.charAt(i) == 'R')) {
                        countR++;
                    }
                    else if ((line.charAt(i) == 's') || (line.charAt(i) == 'S')) {
                        countS++;
                    }
                    else if ((line.charAt(i) == 't') || (line.charAt(i) == 'T')) {
                        countT++;
                    }
                    else if ((line.charAt(i) == 'u') || (line.charAt(i) == 'U')) {
                        countU++;
                    }
                    else if ((line.charAt(i) == 'v') || (line.charAt(i) == 'V')) {
                        countV++;
                    }
                    else if ((line.charAt(i) == 'w') || (line.charAt(i) == 'W')) {
                        countW++;
                    }
                    else if ((line.charAt(i) == 'x') || (line.charAt(i) == 'X')) {
                        countX++;
                    }
                    else if ((line.charAt(i) == 'y') || (line.charAt(i) == 'Y')) {
                        countY++;
                    }
                    else if ((line.charAt(i) == 'z') || (line.charAt(i) == 'Z')) {
                        countZ++;
                    }
                    else if ((line.charAt(i) == 'p') || (line.charAt(i) == 'P')) {
                        countP++;
                    }
                    else if (line.charAt(i) == '.') {
                        sentenceCount++;
                    }
                    else if (line.charAt(i) == ' ') {
                        wordCount++;
                    }
                    
                }
            }
            
            System.out.println("Number of sentences: " + sentenceCount);
            System.out.println("Number of words: " + wordCount);
            System.out.println("A : " + countA + " B : " + countB + " C : " + countC + " D : " + countD + " E : " + countE + " F : " + countF + " G : " + countG + " H : " + countH);
            System.out.println("I : " + countI + " J : " + countJ + " K : " + countK + " L : " + countL + " M : " + countM + " N : " + countN + " O : " + countO + " P : " + countP);
            System.out.println("Q : " + countQ + " R : " + countR + " S : " + countS + " T : " + countT + " U : " + countU + " V : " + countV + " W : " + countW + " X : " + countX);
            System.out.println("Y : " + countY + " Z : " + countZ);
        }
        catch (FileNotFoundException e) {
            System.out.println("File Not Found.");
        }
    }
}