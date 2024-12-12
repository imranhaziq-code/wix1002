package L7;

import java.util.Scanner;
import java.net.URL;
import java.io.InputStream;
import java.net.URLConnection;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

public class L7Q2 {
    public static void main(String[] args) {
        String filename = "index.htm";

        try {
            URL u = new URL("https://fsktm.um.edu.my/");
            URLConnection cnn = u.openConnection();
            InputStream stream = cnn.getInputStream();
            Scanner in = new Scanner(stream);

            PrintWriter writer = new PrintWriter(new FileOutputStream(filename));

            while (in.hasNextLine()) {
                String line = in.nextLine();
                writer.println(line);
            }

            writer.close();

            System.out.println("Web page content saved to " + filename);
        } catch (IOException e) {
            System.out.println("IO Error: " + e.getMessage());
        }
    }
}
