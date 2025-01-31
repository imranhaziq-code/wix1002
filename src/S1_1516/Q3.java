package S1_1516;

import java.util.*;
import java.io.*;

public class Q3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Random r = new Random();
        System.out.print("Enter the number of random integer: ");
        int number = s.nextInt();
        int[] arr = new int[number];
        
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(0, 1001);
        }
        
        display(arr);
        maximum(arr);
        roundToNearestTenth(arr);
        reversedOrder(arr);
    }
    
    public static void display(int[] arr) {
        System.out.print("The random integer : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }
    
    public static void maximum(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Maximum Number : " + max);
    }
    
    public static void roundToNearestTenth(int[] arr) {
    System.out.print("The approximation of the integer to the nearest tenth : ");
    for (int i = 0; i < arr.length; i++) {
        int roundedValue = ((arr[i] + 5) / 10) * 10;
        System.out.print(roundedValue + " ");
    }
    System.out.println();
    }
    
    public static void reversedOrder(int[] arr) {
        System.out.print("The random integer in reverse order: ");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }
}

