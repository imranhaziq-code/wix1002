package L6;

import java.util.Scanner;

public class L6Q6 {
    
    public static boolean isPrime(int num){
        int count = 0;
        
        for (int i = 1; i <= num; i++){
            if (num % i == 0){
                count++;
            }  
        }   
        return count == 2;
    }
    
    public static boolean isPalindromicPrime(int num) {
        String stringNum = String.valueOf(num);
        String reversedString = "";
        
        for (int i = stringNum.length() - 1; i >= 0; i--) {
            reversedString += stringNum.charAt(i);
        }
        int reversedNum = Integer.valueOf(reversedString);
        
        return ((num == reversedNum) && isPrime(num));
    }
    
    public static boolean isEmirp(int num) {
        String stringNum = String.valueOf(num);
        String reversedString = "";
        
        for (int i = stringNum.length() - 1; i >= 0; i--) {
            reversedString += stringNum.charAt(i);
        }
        int reversedNum = Integer.valueOf(reversedString);
        
        return (isPrime(num) && isPrime(reversedNum) && (num != reversedNum));
    }
    
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Please enter a number: ");
        int num = keyboard.nextInt();

        if (isPalindromicPrime(num)){
            System.out.println(num + " is a Palindromic Prime.");
        }
        else if (isEmirp(num)){
            System.out.println(num + " is an Emirp.");
        }
        else {
            System.out.println(num + " are neither Palindromic Prime nor Emirp.");
        }
    }
}
