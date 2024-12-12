package T7;

import java.io.PrintWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;

public class T7Q1a {
    public static void main(String[] args) {
        Random r = new Random();
        String filename = "integer.txt";
        int[] arr = new int[10];
        
        try {
            PrintWriter output = new PrintWriter(new FileOutputStream(filename));
            for(int i = 0; i < 10; i++){
                arr[i] = r.nextInt(1001);
                output.print(arr[i] + " ");
            }
            output.close();
        }
        catch (IOException e){
            System.out.println("An error occured.");
        }
    }
}
