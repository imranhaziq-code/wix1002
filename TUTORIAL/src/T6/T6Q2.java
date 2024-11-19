package T6;

import java.util.Scanner;

public class T6Q2 {
    public static void DecreasingOrder(int number[]){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
            if (number[j] < number[j + 1]) {
                int temp = number[j];
                number[j] = number[j + 1];
                number[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < 3; i++){
            System.out.print(number[i] + ((i == 2)? "":", "));
        }
        System.out.println("");
    }
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        int[] num = new int[3];
        
        System.out.println("Please enter three numbers: ");
        for (int i = 0; i < 3; i++) {
            num[i] = keyboard.nextInt();
        }
        
        System.out.println("\nDecreasing order: ");
        DecreasingOrder(num);
    }
}
