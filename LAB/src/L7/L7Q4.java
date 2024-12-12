package L7;

import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.FileInputStream;

public class L7Q4 {
    public static void main(String[] args) {

        try {
            Scanner scanner = new Scanner(new FileInputStream("order.txt"));

            int charCount = 0;
            int wordCount = 0;
            int lineCount = 0;

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                lineCount++;

                charCount += line.length();

                String[] words = line.split(" "); 
                wordCount += words.length;
            }

            System.out.println("Number of characters: " + charCount);
            System.out.println("Number of words: " + wordCount);
            System.out.println("Number of lines: " + lineCount);

        } 
        catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }
    }
}
