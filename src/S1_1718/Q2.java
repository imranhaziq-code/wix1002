package S1_1718;

import java.util.*;
import java.io.*;

public class Q2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Random r = new Random();
        
        System.out.print("Enter N number: ");
        int n = s.nextInt();
        
        int[] arr = new int[n];
        int aCount = 0;
        int aaCount = 0;
        int aaaCount = 0;
        
        System.out.print("The random numbers are: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(50, 151);
            if ((arr[i] % 10 == 0) || (arr[i] % 10 == 1) || (arr[i] % 10 == 2) || (arr[i] % 10 == 3))
                aaaCount++;
            else if ((arr[i] % 10 == 4) || (arr[i] % 10 == 5) || (arr[i] % 10 == 6))
                aaCount++;
            else 
                aCount++;
            System.out.print(arr[i] + " ");
        }
        System.out.println("\nGroup AAA: " + aaaCount);
        System.out.println("Group AA: " + aaCount);
        System.out.println("Group A: " + aCount);
    }
}
