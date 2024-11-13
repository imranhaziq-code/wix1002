package VIVA1;

import java.util.Scanner;

public class V1Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num;
        System.out.print("enter the numbers : ");
        num = sc.nextLong();
          
        long onedigit=0l;
        long sumofdigit=0l;
        long temporary = num;
        
        do{
             sumofdigit += temporary % 10;
             temporary /= 10; 
        }while(temporary >0);
            
        if(sumofdigit >= 10){
            while( sumofdigit >= 10){
                onedigit = 0;
            while( sumofdigit> 0){
                onedigit += sumofdigit % 10;
                sumofdigit /= 10;             
            } 
          sumofdigit = onedigit;
        } 
           System.out.println("The result of addition to single digit is : " + onedigit);
        }
        else
        System.out.println(" The result of addition to single digit is : " + sumofdigit); 
    }
}
