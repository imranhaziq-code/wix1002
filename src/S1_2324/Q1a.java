package S1_2324;

import java.util.*;
import java.io.*;
        
public class Q1a {
    public static void main(String[] args) {
        //Q1a
        Scanner scanner = new Scanner(System.in);
        String str;
        int posNum = 0;
        int negNum = 0;
        int zero = 0;
        
        while(true){ 
            System.out.print("Please enter a number: ");
            str = scanner.nextLine();
            if (str.equals("X")){
                break;
            }
            else {
                 int number = Integer.parseInt(str);
                 
                 if (number > 0) {
                     posNum++;
                 }
                 else if (number < 0) {
                     negNum++;
                 }
                 else if (number == 0) { 
                     zero++;
                 }
                 else {
                     System.out.println("Invalid entry.");
                 }
            }
        }
        
        System.out.println("\nNumber of positive numbers: " + posNum);
        System.out.println("Number of negative numbers: " + negNum);
        System.out.println("Number of zeroes: " + zero);
    }
}
