package L7;

import java.util.Scanner;
import java.io.PrintWriter;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileInputStream;

public class L7Q3 {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(new FileInputStream("order.txt"));
            PrintWriter writer = new PrintWriter(new FileOutputStream("reverse.txt"));
            
            while (scanner.hasNextLine()){
                String line = scanner.nextLine();
                String reversedLine = "";
                for (int i = line.length() - 1; i >= 0; i--){
                    reversedLine += line.charAt(i);
                } 
                writer.println(reversedLine);
            } 
            System.out.println("File reversed and saved to reverse.txt");
            writer.close();
        }
        catch (FileNotFoundException e){
            System.out.println("File not found.");
        }
        catch (IOException e){
            System.out.println("An error occured.");
        }
    }
}
