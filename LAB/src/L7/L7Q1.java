package L7;

import java.io.ObjectOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.*;
import java.util.Scanner;

public class L7Q1 {
    public static void main(String[] args) {
        String filename = "coursename.dat";
        String[] courseCode = {"WXES1116", "WXES1115", "WXES1110", "WXES1112"};
        String[] courseName = {"Programming I", "Data Structure", "Operating System", "Computing Mathematics I"};
        
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename));
            oos.writeObject(courseCode);
            oos.writeObject(courseName);
            System.out.println("Course data saved to " + filename);
            oos.close();
        }
        catch (IOException e){
            System.out.println("An error occured.");
            return;
        }
        
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename));
            String[] loadedCourseCode = (String[]) ois.readObject();
            String[] loadedCourseName = (String[]) ois.readObject();
            
            Scanner input = new Scanner(System.in);
            System.out.print("Enter a course code: ");
            String courseCodeInput = input.nextLine();
            
            boolean found = false;
            for (int i = 0; i < loadedCourseCode.length; i++){
                if(loadedCourseCode[i].equalsIgnoreCase(courseCodeInput)){
                    System.out.println("Course Name: " + loadedCourseName[i]);
                    found = true;
                    break;
                }
            }
            
            if (!found){
                System.out.println("Course code not found.");
            }
        }
        catch (FileNotFoundException e){
            System.out.println("File cannot be found.");
        }
        catch (ClassNotFoundException e){
            System.out.println("Class cannot be found.");
        }
        catch (IOException e){
            System.out.println("An error occured.");
        }
    }
}
