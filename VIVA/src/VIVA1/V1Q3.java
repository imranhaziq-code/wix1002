package VIVA1;

import java.util.Scanner;

public class V1Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number greater than 1: ");
        int number = sc.nextInt();
        boolean isPrime = false;
        
        if(number <= 1) {
            System.out.println("Input must be greater than 1.");
            return;
        }
        
        int factorCount = 0;
        long sumOfFactors = 0;
        long productOfFactors = 1;
        boolean overflow = false;
        String factorsOutput = "";

        for(int i = 1; i <= number; i++) {
            if(number % i == 0) {
                factorCount++;
                factorsOutput += i + (i < number ? ", " : "");
                sumOfFactors += i;
                if(productOfFactors <= Long.MAX_VALUE / i) {
                    productOfFactors *= i;
                } else{
                    overflow = true;
                }
            }
        }
        
        if(factorCount == 2) {
            isPrime = true;
        } else{
            isPrime = false;
        }
        
        if(isPrime) {
            System.out.println("Integer is a prime number\n");
        } else{
            System.out.printf("Integer is not a prime number, it has %d factors\n", factorCount);
            System.out.println("The factors of this integer are:");
            System.out.println(factorsOutput);
            System.out.println("The sum of the factors is " + sumOfFactors);
            System.out.println("The product of the factors is " + (overflow ? "too large to display" : productOfFactors));
            
            if(sumOfFactors == number * 2) {
                System.out.println(number + " is a perfect number.");
            } else{
                System.out.println(number + " is not a perfect number.");
            }

           
            System.out.print("Prime numbers between 2 and " + number + ": ");
            boolean firstPrime = true;
            for(int i = 2; i < number; i++) {
                boolean isPrimeNum = true;
                for(int j = 2; j <= Math.sqrt(i); j++) {
                    if(i % j == 0) {
                        isPrimeNum = false;
                        break;
                    }
                }
                
                if(isPrimeNum) {
                    if(!firstPrime) {
                        System.out.print(", ");
                    }
                    System.out.print(i);
                    firstPrime = false;
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
