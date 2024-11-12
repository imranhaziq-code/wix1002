package T5;

import java.util.Random;

public class T5Q6 {
    public static void main(String[] args) {
        Random rand = new Random();
        
        int randNum = rand.nextInt(256);
        String convert = Integer.toBinaryString(randNum);
        System.out.println("Random number: " + randNum);
        System.out.println("Converted number: " + convert);
        
        String convertBit = String.format("%8s", Integer.toBinaryString(randNum)).replace(' ', '0');
        String[] arr = convertBit.split("");
        System.out.print("8 bit array: ");
        for(String n : arr){
            System.out.print(n);
        }
        System.out.println("");
    }
}
