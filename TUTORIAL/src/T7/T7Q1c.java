package T7;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.FileOutputStream;
import java.util.Random;

public class T7Q1c {
    public static void main(String[] args) {
        Random r = new Random();
        String filename = "integer.dat";
        int[] arr = new int[10];
        
        try {
            ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream(filename));
            for(int i = 0; i < 10; i++){
                arr[i] = r.nextInt(1001);
                output.writeInt(arr[i]);
                output.writeUTF(" ");
            }
            output.close();
        }
        catch (IOException e){
            System.out.println("An error occured.");
        }
    }
}
