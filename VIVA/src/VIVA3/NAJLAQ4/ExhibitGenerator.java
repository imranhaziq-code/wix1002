package VIVA3.NAJLAQ4;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ExhibitGenerator {
    public static void main(String[] args) {
        generateExhibits("exhibits.txt");
    }
    public static void generateExhibits(String filename) {
        // Specific exhibits to save
        String[] titles = {
            "Starry Night", 
            "David", 
            "The Persistence of Memory"
        };
            String[] artists = {
            "Vincent van Gogh", 
            "Michelangelo", 
            "Salvador Dalí"
        };
           int[] years = {1889, 1504, 1931};
           String[] types = {
            "Painting", 
            "Sculpture", 
            "Painting"
        };
        String[] descriptions = {
            "A famous painting that depicts a night sky swirling with stars.",
            "A marble statue representing the biblical hero David.",
            "A surreal painting featuring melting clocks."
        };
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            for (int i = 0; i < titles.length; i++) {
                String exhibitEntry = String.format("%s, %s, %d, %s, %s",
                        titles[i], artists[i], years[i], types[i], descriptions[i]);
                writer.write(exhibitEntry);
                writer.newLine();
            }
            System.out.println("Selected exhibits have been generated and saved to " + filename);
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
    }
}
