package T7;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class T7Q3 {
    public static void main(String[] args) {
        String sentence = "Hello, World!";
        String filename = "data.txt";

        // Step 1: Convert the sentence to binary and store it in a text file
        try {
            PrintWriter writer = new PrintWriter(new FileOutputStream(filename));
            System.out.println("Writing to the file...");

            for (int i = 0; i < sentence.length(); i++) {
                char c = sentence.charAt(i);
                int asciiValue = (int) c;

                // Convert the character to its 8-bit binary representation
                String binary = Integer.toBinaryString(asciiValue);

                // Pad the binary string to ensure it is exactly 8 bits
                while (binary.length() < 8) {
                    binary = "0" + binary;
                }

                // Write the 8-bit binary string to the file with a space in between
                writer.printf("%s ", binary);
            }

            writer.close();  // Explicitly flush the output stream
            System.out.println("Content written to the file successfully.");

        } catch (IOException e) {
            System.out.println("An error occured.");
        }

        // Step 2: Read from the text file and reconstruct the sentence
        try  {
            Scanner scanner = new Scanner(new FileInputStream(filename));
            String sentenceReconstructed = "";

            while (scanner.hasNext()) {
                String binary = scanner.next();

                int asciiValue = Integer.parseInt(binary, 2);
                char character = (char) asciiValue;

                // Concatenate characters to reconstruct the sentence
                sentenceReconstructed += character;
            }

            System.out.println("Reconstructed Sentence: " + sentenceReconstructed);

        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }
    }
}
