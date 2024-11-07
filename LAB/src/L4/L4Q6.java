package L4;

import java.util.Random;

public class L4Q6 {
    public static void main(String[] args) {
        Random g = new Random();
        int num;
        
        while (true){
            num = g.nextInt();
            if (num > 0){
                System.out.println("Random integer: "+num);
                break;
            }
        }
        
        String str = String.valueOf(num);
        System.out.print("Number of digit in the integer: "+str.length());
        System.out.println("");
        
    }
}
