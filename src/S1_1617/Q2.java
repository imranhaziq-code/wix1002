package S1_1617;

import java.util.*;
import java.io.*;

public class Q2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double fee;
        double rate;
        int year;
        
        System.out.print("Enter the initial tuition fee (i.e year 1): ");
        fee = s.nextDouble();
        System.out.print("Enter the yearly rate of increment (e.g enter 5.2 for 5.2%): ");
        rate = s.nextDouble();
        System.out.print("Enter the year for which you wish to compute the tuition fee for: ");
        year = s.nextInt();
        System.out.printf("\nComputed tuition fee for year 3 is: %.2f\n" , computeFee(fee, rate, year));
    }
    
    public static double computeFee(double fee, double rate, int year) {
        for (int i = 2; i <= year; i++) {
            fee += ((rate / 100) * fee);
        }
        return fee;
    }
}
