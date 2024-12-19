package VIVA2;

import java.util.Scanner;

public class V2Q6 {

    public static void generateInitials(String fullname) {
    fullname = fullname.toUpperCase();
    
    if (fullname.charAt(0) != ' ')
        System.out.print(fullname.charAt(0));
    
    for (int i = 0; i < fullname.length() - 1; i++) {
        if (fullname.charAt(i) == ' ' && fullname.charAt(i + 1) != ' ') {
            String word = fullname.substring(i + 1, fullname.indexOf(' ', i + 1) == -1 ? fullname.length() : fullname.indexOf(' ', i + 1));
            
            if (!word.equalsIgnoreCase("BIN") && !word.equalsIgnoreCase("BINTI") &&
                !word.equalsIgnoreCase("A/L") && !word.equalsIgnoreCase("A/P") &&
                !word.equals("/") && !word.equals("-")) {
                System.out.print(fullname.charAt(i + 1));
            }
        }
    }
}
     // Method to determine if the welcome message should be printed
    public static boolean isPrintingWelcomeMessage(String name) {
        String[] specialUsers = {"Kah Sing", "Lee Kah Sing", "Ridwan", "Ridwan Faiz", "Suresh"};
        for (String user : specialUsers) {
            if (name.equalsIgnoreCase(user)) {
                return true;
            }
        }
        return false;
    }
    
    // Method to calculate the time interval
    public static String calculateInterval(String startTime, String endTime) {
        String[] startParts = startTime.split(":");
        String[] endParts = endTime.split(":");

        int startSeconds = Integer.parseInt(startParts[0]) * 3600 +
                           Integer.parseInt(startParts[1]) * 60 +
                           Integer.parseInt(startParts[2]);

        int endSeconds = Integer.parseInt(endParts[0]) * 3600 +
                         Integer.parseInt(endParts[1]) * 60 +
                         Integer.parseInt(endParts[2]);

        // Adjust for crossing midnight
        if (endSeconds < startSeconds) {
            endSeconds += 24 * 3600; // Add 24 hours in seconds
        }

        int intervalSeconds = endSeconds - startSeconds;

        int hours = intervalSeconds / 3600;
        int minutes = (intervalSeconds % 3600) / 60;
        int seconds = intervalSeconds % 60;

        return String.format("%02d:%02d:%02d", hours, minutes, seconds);
    }
    
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

            // Read the name and generate initials
            System.out.print("Enter the user's name: ");
            String fullname = scanner.nextLine();
            generateInitials(fullname);
            System.out.println();

          
           

            // Determine if the welcome message should be printed
            if (isPrintingWelcomeMessage(fullname)) {
                System.out.println("Welcome to G101, Kolej Kediaman Kinabalu, Universiti Malaya!");
            }

            // Read start and end times
            System.out.print("Enter the start time (hh:mm:ss): ");
            String startTime = scanner.nextLine();
            System.out.print("Enter the end time (hh:mm:ss): ");
            String endTime = scanner.nextLine();

            // Calculate and print time interval
            String interval = calculateInterval(startTime, endTime);
            System.out.println("Time Interval: " + interval);

            System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        }
}
