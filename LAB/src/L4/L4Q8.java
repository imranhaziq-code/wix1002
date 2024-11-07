package L4;

import java.util.Random;

public class L4Q8 {
    public static void main(String[] args) {
        Random g = new Random();
        int min = 2;
        int max = 101;
        int num;
        
        while (true){
            num = g.nextInt(min, max);
            if (num % num == 0){
                System.out.println("Random prime integer: "+num);
                break;
            }
        }
    }
}
