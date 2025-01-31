package S1_2324;

import java.util.*;
import java.io.*;

public class Q1b {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Please enter a number: ");
        int number = scanner.nextInt();
        double sum = 0.0;
        
        for (int i = 1; i <= number; i++) {
            sum += (1 / (double)i);
        }
        
        System.out.println("Sum of series: " + sum);
    }
}
