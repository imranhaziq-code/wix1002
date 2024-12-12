package L7;

import java.io.ObjectInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class L7Q5 {
    public static void main(String[] args) {
        try {
            ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("person.dat"));
            int cnt = inputStream.readInt();
            String[] name = new String[cnt];
            int[] age = new int[cnt];
            char[] gender = new char[cnt];
            
            for (int j = 0; j < cnt; j++) {
                name[j] = inputStream.readUTF();
                age[j] = inputStream.readInt();
                gender[j] = inputStream.readChar();
            }

            for (int i = 0; i < cnt - 1; i++) {
                for (int j = 0; j < cnt - 1 - i; j++) {
                    if (name[j].compareTo(name[j + 1]) > 0) {
                        // Swap names
                        String tempName = name[j];
                        name[j] = name[j + 1];
                        name[j + 1] = tempName;
                        
                        // Swap corresponding ages
                        int tempAge = age[j];
                        age[j] = age[j + 1];
                        age[j + 1] = tempAge;
                        
                        // Swap corresponding genders
                        char tempGender = gender[j];
                        gender[j] = gender[j + 1];
                        gender[j + 1] = tempGender;
                    }
                }
            }

            for (int i = 0; i < cnt; i++) {
                System.out.print("Name: " + name[i] + " Age: " + age[i] + " Gender: ");
                if (gender[i] == 'M') {
                    System.out.println("Male");
                } else {
                    System.out.println("Female");
                }
            }
        }
        catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }
        catch (IOException e){
            System.out.println("An error occured.");
        }
    }
}
