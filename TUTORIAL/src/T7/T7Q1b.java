package T7;

import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class T7Q1b {
    public static void main(String[] args) {
        int largest = Integer.MIN_VALUE;
        String filename = "integer.txt";
        
        try {
            Scanner input = new Scanner(new FileInputStream(filename));
            System.out.print("Integers: ");
            while (input.hasNextInt()){
                int number = input.nextInt();
                System.out.print(number + " ");
                largest = Math.max(largest, number);
            }
            input.close();
            System.out.println("\nMaximum Value: " + largest);
        }
        catch (FileNotFoundException e){
            System.out.println("File was not found.");
        }
    }
}
