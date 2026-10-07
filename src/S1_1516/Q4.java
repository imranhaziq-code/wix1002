package S1_1516;

import java.io.*;
import java.util.*;

public class Q4 {
    public static void main(String[] args) {
        try {
            Scanner s1 = new Scanner(new FileReader("Q4.txt"));
            int i = 0;
            
            while (s1.hasNextLine()) {
                s1.nextLine();
                i++;
            }
            
            String[] password1 = new String[i];
            
            Scanner s2 = new Scanner(new FileReader("Q4.txt"));
            int j = 0;
            
            while (s2.hasNextLine()) {
                password1[j] = s2.nextLine();
                j++;
            }
            
            isStrong(password1);

            s1.close();
            s2.close();
        }
        catch (FileNotFoundException e) {
            System.out.println("File Not Found.");
        }
    }
    
    public static void isStrong(String[] password1) {
        
            
        for (int j = 0; j < password1.length; j++) {
            boolean is8Char = false;
            boolean isUpper = false;
            boolean isLower = false;
            boolean isDigit = false;
            boolean isChar = false;
            
                
                
                for (int k = 0; k < password1[j].length(); k++) {
                    if (Character.isUpperCase(password1[j].charAt(k))) {
                        isUpper = true;
                    }
                    if (Character.isLowerCase(password1[j].charAt(k))) {
                        isLower = true;
                    }
                    if (Character.isDigit(password1[j].charAt(k))) {
                        isDigit = true;
                    }
                    if (!Character.isLetterOrDigit(password1[j].charAt(k))) {
                        isChar = true;
                    }
                    if (password1[j].length() >= 8) {
                    is8Char = true;
                    }
                }
                
                if (is8Char && isUpper && isLower && isDigit && isChar) {
                        System.out.println("Strong password.");
                    }
                    else {
                        System.out.println("Not a strong password.");
                    }
        }
    }
}

