package T5;

import java.util.Scanner;

public class T5Q4 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Enter your sentence here: ");
        String[] arr = keyboard.nextLine().split(" ");
		
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            if (arr[i].equals("the"))
                count++;
        }
		
        System.out.println("The occurrence of word 'the' : " +count);
        
    }
}
