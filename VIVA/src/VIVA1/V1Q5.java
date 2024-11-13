package VIVA1;

import java.util.Scanner;

public class V1Q5 {
    public static void main(String[] args) {
        Scanner abc = new Scanner(System.in);
        int count = 0;
        System.out.print("Enter a string : ");
        String ayat = abc.nextLine();
        boolean previousRemix = false; //no REMIX before string being read
        
         if (ayat.length() <= 200) {
             //read all characters using FOR loop
            for (int i = 0; i < ayat.length(); i++) {
                //i+4 so that it not more than ayat.length()
                if (i + 4 < ayat.length() && ayat.charAt(i) == 'R' && ayat.charAt(i + 1) == 'E' &&
                    ayat.charAt(i + 2) == 'M' && ayat.charAt(i + 3) == 'I' && ayat.charAt(i + 4) == 'X') {
                    i += 4; //skip 'R''E''M''I''X' and proceed to next character
                    if (previousRemix == false) { 
                        if (count > 0) {
                            System.out.print(" "); /*print a space only after a word
                            and not before a word*/
                        }
                            previousRemix = true; /*if previous is 'R''E''M''I''X',
                        don't print a space until last 'R''E''M''I''X' is read*/
                    }
                } else {
                    System.out.print(ayat.charAt(i));
                    count++;
                    previousRemix = false; 
                }
            }
         }
         System.out.println();
    }
}
