package T7;

import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;
import java.io.FileInputStream;

public class T7Q1d {
    public static void main(String[] args) {
        String filename = "integer.dat";
        int total = 0;
        double average;
        int number;
        
        try{
            ObjectInputStream input = new ObjectInputStream(new FileInputStream(filename));
            for (int i = 0; i < 10; i++){
                number = input.readInt();
                System.out.print(number);
                System.out.print(input.readUTF());
                total += number;
            }
            average = (double)total / 10;
            input.close();
            System.out.println("\nAverage of all integers: " +average);
        }
        catch (FileNotFoundException e){
            System.out.println("File was not found");
        }
        catch (IOException e){
            System.out.println("An error occured.");
        }
    }
}
