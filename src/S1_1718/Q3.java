package S1_1718;

import java.util.*;
import java.io.*;

public class Q3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int fontSize;
        char fontType;
        int format;
        
        System.out.print("Enter font size: ");
        fontSize = s.nextInt();
        System.out.print("Enter font type: ");
        fontType = s.next().charAt(0);
        while (true) {
            System.out.print("Enter format [1 - Vertical, 2 - Horizontal]: ");
            format = s.nextInt();
            if ((format < 1) || (format > 2))
                System.out.println("Invalid format.");
            else
                break;
        }
        
        digitalEight(fontSize, fontType, format);
    }
    
    public static void digitalEight(int fontSize, char fontType, int format) {
        if (format == 1 ) {
            for (int i = 0; i < 3 + (fontSize * 2); i++) {
                if ((i == 0) || (i == (fontSize + 1)) || (i == 3 + ((fontSize * 2) - 1))) {
                    for (int j = 0; j < 2 + fontSize; j++) {
                        System.out.print(fontType);
                    }
                }
                else {
                    for (int k = 0; k < 2 + fontSize; k++) {
                        if ((k == 0) || (k == (2 + fontSize - 1))) {
                            System.out.print(fontType);
                        }
                        else {
                            System.out.print(" ");
                        }
                    }
                }
                System.out.println("");
            }
        }
        if (format == 2 ) {
            for (int i = 0; i < 2 + fontSize; i++) {
                if ((i == 0) || (i == 2 + fontSize - 1)) {
                    for (int j = 0; j < 3 + (fontSize * 2); j++) {
                        System.out.print(fontType);
                    }
                }
                else {
                    for (int k = 0; k < 3 + (fontSize * 2); k++) {
                        if ((k == 0) || (k == 2 + fontSize - 1) || (k == (3 + (fontSize * 2) - 1))) {
                            System.out.print(fontType);
                        }
                        else {
                            System.out.print(" ");
                        }
                    }
                }
                System.out.println("");
            }
        }
    }
}
