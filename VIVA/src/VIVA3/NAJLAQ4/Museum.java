package VIVA3.NAJLAQ4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Museum {
    private ArrayList<Exhibit> exhibits;
    // Constructor
    public Museum(){
        exhibits = new ArrayList<>();
    }
     public void loadExhibits(String filename){  // Method to load exhibits from a file
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] details = line.split(","); // Assuming CSV format
                if(details.length == 5) {
                    Exhibit exhibit = new Exhibit(details[0].trim(), details[1].trim(),
                                                   Integer.parseInt(details[2].trim()),
                                                   details[3].trim(), details[4].trim());
                    exhibits.add(exhibit);
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
    }
    public void searchExhibitsByArtist(String artist){// Method to search exhibits by artist
        boolean found =false;
        for(Exhibit exhibit:exhibits) {
            if(exhibit.getArtist().equalsIgnoreCase(artist)) {
                System.out.println(exhibit.getDetails());
                found = true;
            }
        }
        if(!found) {
            System.out.println("No exhibits found by artist: " + artist);
        }
    }
    public void searchExhibitsByType(String type){ // Method to search exhibits by type
        boolean found = false;
        for(Exhibit exhibit : exhibits) {
            if(exhibit.getType().equalsIgnoreCase(type)) {
                System.out.println(exhibit.getDetails());
                found = true;
            }
        }
        if(!found) {
            System.out.println("No exhibits found of type: " + type);
        }
    }
    public void searchExhibitsByYear(int year){// Method to search exhibits by year
        boolean found = false;
        for(Exhibit exhibit:exhibits) {
            if(exhibit.getYear() == year) {
                System.out.println(exhibit.getDetails());
                found =true;
            }
        }
        if(!found) {
            System.out.println("No exhibits found from year: " + year);
        }
    }
    public void viewAllExhibits(){// Method to view all exhibits
        if(exhibits.isEmpty()) {
            System.out.println("No exhibits available.");
        } else {
            for (Exhibit exhibit:exhibits) {
                System.out.println(exhibit.getDetails ());
            }
        }
    }
}
