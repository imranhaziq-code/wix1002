package T4;

import java.util.Random;

public class Q1c {
    public static void main(String[] args) {
        Random g = new Random();
        
        int min = 0;
        int max = 101;
        int num;
        
        for (int i = 0; i < 4; i++){
            System.out.println("");
            for (int j = 0 ; j < 5; j++){
                num = g.nextInt(min, max);
                System.out.printf("%5d", num);
            }
        }
        System.out.println("");
    }
}
