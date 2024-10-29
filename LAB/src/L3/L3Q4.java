package L3;

import java.util.Random;
public class L3Q4 {
    public static void main(String[] args) {
        Random rand = new Random();
        
        int min = 1;
        int max = 6;
        
        int p1s1 = rand.nextInt(min,max);
        int p1s2 = rand.nextInt(min,max);
        int p2s1 = rand.nextInt(min,max);
        int p2s2 = rand.nextInt(min,max);
        
        System.out.println("Player 1 first dice:   "+p1s1);
        System.out.println("Player 1 second dice:  "+p1s2);
        System.out.println("Player 2 first dice:   "+p2s1);
        System.out.println("Player 2 second dice:  "+p2s2);
        System.out.println("");
        
        int totalP1 = p1s1 + p1s2;
        int totalP2 = p2s1 + p2s2;
        
        if (totalP1 > totalP2){
        System.out.println("Player 1 win!");
    }
        else{
                System.out.println("Player 2 win!");
                }
    }
}
