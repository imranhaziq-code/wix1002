package S1_1617;

import java.util.*;
import java.io.*;

public class Q3 {
    public static void main(String[] args) {
        try {
            Random r = new Random();
            BufferedWriter bw = new BufferedWriter(new FileWriter("data.txt"));
            String generatedStr = "";
            int generatedInt;
            int[] letter = new int[6];
            
            for (int i = 0; i < 6; i++) {
                do {
                    generatedInt = r.nextInt(65, 123);
                } while (generatedInt > 90 && generatedInt < 97);
                
                letter[i] = generatedInt;
                
                if (generatedInt == 65) {
                    generatedStr += "A";
                }
                else if (generatedInt == 66) {
                    generatedStr += "B";
                }
                else if (generatedInt == 67) {
                    generatedStr += "C";
                }
                else if (generatedInt == 68) {
                    generatedStr += "D";
                }
                else if (generatedInt == 69) {
                    generatedStr += "E";
                }
                else if (generatedInt == 70) {
                    generatedStr += "F";
                }
                else if (generatedInt == 71) {
                    generatedStr += "G";
                }
                else if (generatedInt == 72) {
                    generatedStr += "H";
                }
                else if (generatedInt == 73) {
                    generatedStr += "I";
                }
                else if (generatedInt == 74) {
                    generatedStr += "J";
                }
                else if (generatedInt == 75) {
                    generatedStr += "K";
                }
                else if (generatedInt == 76) {
                    generatedStr += "L";
                }
                else if (generatedInt == 77) {
                    generatedStr += "M";
                }
                else if (generatedInt == 78) {
                    generatedStr += "N";
                }
                else if (generatedInt == 79) {
                    generatedStr += "O";
                }
                else if (generatedInt == 80) {
                    generatedStr += "P";
                }
                else if (generatedInt == 81) {
                    generatedStr += "Q";
                }
                else if (generatedInt == 82) {
                    generatedStr += "R";
                }
                else if (generatedInt == 83) {
                    generatedStr += "S";
                }
                else if (generatedInt == 84) {
                    generatedStr += "T";
                }
                else if (generatedInt == 85) {
                    generatedStr += "U";
                }
                else if (generatedInt == 86) {
                    generatedStr += "V";
                }
                else if (generatedInt == 87){
                    generatedStr += "W";
                }
                else if (generatedInt == 88) {
                    generatedStr += "X";
                }
                else if (generatedInt == 89) {
                    generatedStr += "Y";
                }
                else if (generatedInt == 90) {
                    generatedStr += "Z";
                }
                else if (generatedInt == 97) {
                    generatedStr += "a";
                }
                else if (generatedInt == 98) {
                    generatedStr += "b";
                }
                else if (generatedInt == 99) {
                    generatedStr += "c";
                }
                else if (generatedInt == 100) {
                    generatedStr += "d";
                }
                else if (generatedInt == 101) {
                    generatedStr += "e";
                }
                else if (generatedInt == 102) {
                    generatedStr += "f";
                }
                else if (generatedInt == 103) {
                    generatedStr += "g";
                }
                else if (generatedInt == 104) {
                    generatedStr += "h";
                }
                else if (generatedInt == 105) {
                    generatedStr += "i";
                }
                else if (generatedInt == 106) {
                    generatedStr += "j";
                }
                else if (generatedInt == 107) {
                    generatedStr += "k";
                }
                else if (generatedInt == 108) {
                    generatedStr += "l";
                }
                else if (generatedInt == 109) {
                    generatedStr += "m";
                }
                else if (generatedInt == 110) {
                    generatedStr += "n";
                }
                else if (generatedInt == 111) {
                    generatedStr += "o";
                }
                else if (generatedInt == 112) {
                    generatedStr += "p";
                }
                else if (generatedInt == 113) {
                    generatedStr += "q";
                }
                else if (generatedInt == 114) {
                    generatedStr += "r";
                }
                else if (generatedInt == 115) {
                    generatedStr += "s";
                }
                else if (generatedInt == 116) {
                    generatedStr += "t";
                }
                else if (generatedInt == 117) {
                    generatedStr += "u";
                }
                else if (generatedInt == 118) {
                    generatedStr += "v";
                }
                else if (generatedInt == 119) {
                    generatedStr += "w";
                }
                else if (generatedInt == 120) {
                    generatedStr += "x";
                }
                else if (generatedInt == 121) {
                    generatedStr += "y";
                }
                else if (generatedInt == 122) {
                    generatedStr += "z";
                }
                else{
                    break;
                }
            }
            
            System.out.println("The string generated is: " + generatedStr);
            
            sort(letter, '>');
            sort(letter, '<');
            
            bw.write(generatedStr);
            bw.close();
        }
        catch(FileNotFoundException e) {
            System.out.println("File not found.");
        }
        catch(IOException e) {
            System.out.println("Error.");
        }
        
        try {
            Scanner br = new Scanner(new FileReader("data.txt"));
            String fromFile;
            fromFile = br.nextLine();
            System.out.println("Original string from file: " + fromFile);
        }
        catch(FileNotFoundException e) {
            System.out.println("File not found.");
        }
    }
    
    public static void sort(int[] letter, char symbol) {
        String word = "";
        if (symbol == '>') {
            for (int i = 0; i < 6 - 1; i++) {
                for (int j = 0; j < 6 - i - 1; j++) {
                    if (letter[j] > letter[j + 1]) {
                        int temp = letter[j];
                        letter[j] = letter[j + 1];
                        letter[j + 1] = temp;
                    }
                }
            }
            for (int i = 0; i < 6; i++) {
            if (letter[i] == 65) {
                    word += "A";
                }
                else if (letter[i] == 66) {
                    word += "B";
                }
                else if (letter[i] == 67) {
                    word += "C";
                }
                else if (letter[i] == 68) {
                    word += "D";
                }
                else if (letter[i] == 69) {
                    word += "E";
                }
                else if (letter[i] == 70) {
                    word += "F";
                }
                else if (letter[i] == 71) {
                    word += "G";
                }
                else if (letter[i] == 72) {
                    word += "H";
                }
                else if (letter[i] == 73) {
                    word += "I";
                }
                else if (letter[i] == 74) {
                    word += "J";
                }
                else if (letter[i] == 75) {
                    word += "K";
                }
                else if (letter[i] == 76) {
                    word += "L";
                }
                else if (letter[i] == 77) {
                    word += "M";
                }
                else if (letter[i] == 78) {
                    word += "N";
                }
                else if (letter[i] == 79) {
                    word += "O";
                }
                else if (letter[i] == 80) {
                    word += "P";
                }
                else if (letter[i] == 81) {
                    word += "Q";
                }
                else if (letter[i] == 82) {
                    word += "R";
                }
                else if (letter[i] == 83) {
                    word += "S";
                }
                else if (letter[i] == 84) {
                    word += "T";
                }
                else if (letter[i] == 85) {
                    word += "U";
                }
                else if (letter[i] == 86) {
                    word += "V";
                }
                else if (letter[i] == 87){
                    word += "W";
                }
                else if (letter[i] == 88) {
                    word += "X";
                }
                else if (letter[i] == 89) {
                    word += "Y";
                }
                else if (letter[i] == 90) {
                    word += "Z";
                }
                else if (letter[i] == 97) {
                    word += "a";
                }
                else if (letter[i] == 98) {
                    word += "b";
                }
                else if (letter[i] == 99) {
                    word += "c";
                }
                else if (letter[i] == 100) {
                    word += "d";
                }
                else if (letter[i] == 101) {
                    word += "e";
                }
                else if (letter[i] == 102) {
                    word += "f";
                }
                else if (letter[i] == 103) {
                    word += "g";
                }
                else if (letter[i] == 104) {
                    word += "h";
                }
                else if (letter[i] == 105) {
                    word += "i";
                }
                else if (letter[i] == 106) {
                    word += "j";
                }
                else if (letter[i] == 107) {
                    word += "k";
                }
                else if (letter[i] == 108) {
                    word += "l";
                }
                else if (letter[i] == 109) {
                    word += "m";
                }
                else if (letter[i] == 110) {
                    word += "n";
                }
                else if (letter[i] == 111) {
                    word += "o";
                }
                else if (letter[i] == 112) {
                    word += "p";
                }
                else if (letter[i] == 113) {
                    word += "q";
                }
                else if (letter[i] == 114) {
                    word += "r";
                }
                else if (letter[i] == 115) {
                    word += "s";
                }
                else if (letter[i] == 116) {
                    word += "t";
                }
                else if (letter[i] == 117) {
                    word += "u";
                }
                else if (letter[i] == 118) {
                    word += "v";
                }
                else if (letter[i] == 119) {
                    word += "w";
                }
                else if (letter[i] == 120) {
                    word += "x";
                }
                else if (letter[i] == 121) {
                    word += "y";
                }
                else if (letter[i] == 122) {
                    word += "z";
                }
                else {
                    break;
                }
            }
            System.out.println("String sorted in ascending order: " + word);
        }
        
        else if (symbol == '<') {
            for (int i = 0; i < 6 - 1; i++) {
                for (int j = 0; j < 6 - i - 1; j++) {
                    if (letter[j] < letter[j + 1]) {
                        int temp = letter[j];
                        letter[j] = letter[j + 1];
                        letter[j + 1] = temp;
                    }
                }
            }
            
            for (int i = 0; i < 6; i++) {
            if (letter[i] == 65) {
                    word += "A";
                }
                else if (letter[i] == 66) {
                    word += "B";
                }
                else if (letter[i] == 67) {
                    word += "C";
                }
                else if (letter[i] == 68) {
                    word += "D";
                }
                else if (letter[i] == 69) {
                    word += "E";
                }
                else if (letter[i] == 70) {
                    word += "F";
                }
                else if (letter[i] == 71) {
                    word += "G";
                }
                else if (letter[i] == 72) {
                    word += "H";
                }
                else if (letter[i] == 73) {
                    word += "I";
                }
                else if (letter[i] == 74) {
                    word += "J";
                }
                else if (letter[i] == 75) {
                    word += "K";
                }
                else if (letter[i] == 76) {
                    word += "L";
                }
                else if (letter[i] == 77) {
                    word += "M";
                }
                else if (letter[i] == 78) {
                    word += "N";
                }
                else if (letter[i] == 79) {
                    word += "O";
                }
                else if (letter[i] == 80) {
                    word += "P";
                }
                else if (letter[i] == 81) {
                    word += "Q";
                }
                else if (letter[i] == 82) {
                    word += "R";
                }
                else if (letter[i] == 83) {
                    word += "S";
                }
                else if (letter[i] == 84) {
                    word += "T";
                }
                else if (letter[i] == 85) {
                    word += "U";
                }
                else if (letter[i] == 86) {
                    word += "V";
                }
                else if (letter[i] == 87){
                    word += "W";
                }
                else if (letter[i] == 88) {
                    word += "X";
                }
                else if (letter[i] == 89) {
                    word += "Y";
                }
                else if (letter[i] == 90) {
                    word += "Z";
                }
                else if (letter[i] == 97) {
                    word += "a";
                }
                else if (letter[i] == 98) {
                    word += "b";
                }
                else if (letter[i] == 99) {
                    word += "c";
                }
                else if (letter[i] == 100) {
                    word += "d";
                }
                else if (letter[i] == 101) {
                    word += "e";
                }
                else if (letter[i] == 102) {
                    word += "f";
                }
                else if (letter[i] == 103) {
                    word += "g";
                }
                else if (letter[i] == 104) {
                    word += "h";
                }
                else if (letter[i] == 105) {
                    word += "i";
                }
                else if (letter[i] == 106) {
                    word += "j";
                }
                else if (letter[i] == 107) {
                    word += "k";
                }
                else if (letter[i] == 108) {
                    word += "l";
                }
                else if (letter[i] == 109) {
                    word += "m";
                }
                else if (letter[i] == 110) {
                    word += "n";
                }
                else if (letter[i] == 111) {
                    word += "o";
                }
                else if (letter[i] == 112) {
                    word += "p";
                }
                else if (letter[i] == 113) {
                    word += "q";
                }
                else if (letter[i] == 114) {
                    word += "r";
                }
                else if (letter[i] == 115) {
                    word += "s";
                }
                else if (letter[i] == 116) {
                    word += "t";
                }
                else if (letter[i] == 117) {
                    word += "u";
                }
                else if (letter[i] == 118) {
                    word += "v";
                }
                else if (letter[i] == 119) {
                    word += "w";
                }
                else if (letter[i] == 120) {
                    word += "x";
                }
                else if (letter[i] == 121) {
                    word += "y";
                }
                else if (letter[i] == 122) {
                    word += "z";
                }
                else {
                    break;
                }
            }
            System.out.println("String sorted in descending order: " + word);
        }
        
        else {
        }
       
        
    }
}