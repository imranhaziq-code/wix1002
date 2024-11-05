package T4;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Enter word/sentence: ");
        String text = keyboard.nextLine();
        
        for (int i = text.length() - 1; i >= 0; i--) {
            System.out.print(text.charAt(i));
        }
        System.out.println("");
    }
}
