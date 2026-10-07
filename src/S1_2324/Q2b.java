package S1_2324;

import java.io.*;
import java.util.*;

public class Q2b {
    public static void main(String[] args) {
        try {
            checkAge(12);
        }
        catch (InvalidAgeException e) {
            System.out.println("Error Message: " + e.getMessage());
        }
    }
    
    public static void checkAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be greater than 18.");
        }
        else {
            System.out.println("Valid age: " + age);
        }
    }
}

class InvalidAgeException extends Exception {
    public InvalidAgeException(String str) {
        super(str);
    }
}