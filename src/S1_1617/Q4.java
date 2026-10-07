package S1_1617;

import java.util.*;
import java.io.*;

public class Q4 {
    public static void main(String[] args) {
        Complex c1 = new Complex(2, 6);
        Complex c2 = new Complex(4, 7);
        
        System.out.println("First complex number: " + c1.toString());
        System.out.println("Second complex number: " + c2.toString());
        
        Complex add = c1.addComplexNum(c2);
        System.out.println("Addition of two complex numbers: " + add.toString());
        
        Complex subs = c1.substractComplexNum(c2);
        System.out.println("Substraction of the two complex numbers: " + subs.toString());
    }
}

class Complex {
    private double real;
    private double imaginary;
    
    public Complex() {
    }
    
    public Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }
    
    public Complex addComplexNum(Complex b) {
        double sumReal = real + b.real;
        double sumImaginary = imaginary + b.imaginary;
        return new Complex(sumReal, sumImaginary);
    }
    
    public Complex substractComplexNum(Complex b) {
        double sumReal = real - b.real;
        double sumImaginary = imaginary - b.imaginary;
        return new Complex(sumReal, sumImaginary);
    }
    
    public String toString() {
        return "(" + (int)real + " + " + (int)imaginary +"i)";
    }
        
}