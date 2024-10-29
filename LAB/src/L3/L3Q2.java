package L3;

import java.util.Random;

public class L3Q2 {
    public static void main(String[] args) {
        Random rand = new Random();
        int min = 0;
        int max = 5;
        int number = rand.nextInt(min,max);  
        String numberInWords;
        
        switch (number) {
            case 0:
                numberInWords = "zero";
                break;
            case 1:
                numberInWords = "one";
                break;
            case 2:
                numberInWords = "two";
                break;
            case 3:
                numberInWords = "three";
                break;
            case 4:
                numberInWords = "four";
                break;
            case 5:
                numberInWords = "five";
                break;
            default:
                numberInWords = "Unknown";
                break;
        }

        System.out.println(number+" is "+numberInWords+".");
    }
}
