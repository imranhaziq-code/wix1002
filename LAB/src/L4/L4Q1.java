package L4;

import java.util.Scanner;

public class L4Q1 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Enter an integer: ");
        int num = keyboard.nextInt();
        
        System.out.print("The factors are: ");
        
        for (int i = 1; i <= num; i++){
            if (num%i == 0){
                if(i == num){
                    System.out.print(i);
                    System.out.println("");
                }
                else{
                    System.out.print(i +", ");
                }
                
            }
        }
    }
}