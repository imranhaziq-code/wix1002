package L8;

import java.util.Scanner;

public class L8Q4 {
    public static void main(String[] args) {
        Fraction fraction = new Fraction();
        fraction.input();  // Accept input from the user
        fraction.displayReducedFraction();  // Display the fraction in lowest terms
    }
}

class Fraction {
    private int numerator;
    private int denominator;
    
    public void input() {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter numerator: ");
        numerator = keyboard.nextInt();
        System.out.print("Enter denominator: ");
        denominator = keyboard.nextInt();
    }
    
    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }
    
    public void setDenominator(int denominator) {
        if (denominator != 0) {
            this.denominator = denominator;
        } else {
            System.out.println("Denominator cannot be zero.");
        }
    }
    
    public int getNumerator() {
        return numerator;
    }
    
    public int getDenominator() {
        return denominator;
    }
    
    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    
    public void displayReducedFraction() {
        int gcd = gcd(numerator, denominator);
        int reducedNumerator = numerator / gcd;
        int reducedDenominator = denominator / gcd;
        System.out.println("Fraction in lowest terms: " + reducedNumerator + "/" + reducedDenominator);
    }
}