package L6;

import java.util.Scanner;

public class L6Q3 {
    
    public static int reverseInteger(int number) {
        int reversed = 0;
        while (number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }
        return reversed;
    }

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        int[] array = new int[10];
        
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter array[" + i + "]: ");
            array[i] = keyboard.nextInt();
        }
        
        System.out.println("\nInverted integers in the array:");
        for (int i = 0; i < 10; i++) {
            int reversed = reverseInteger(array[i]);
            System.out.println("Inverted array[" + i + "]: " + reversed);
        }
    }
}
