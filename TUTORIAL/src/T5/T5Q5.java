package T5;

import java.util.Scanner;

public class T5Q5 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Enter your sentence here: ");
        String[] arr = keyboard.nextLine().split(" ");
        
        for (int i = arr.length - 1; i >= 0; i--){
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }
}
