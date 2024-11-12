package L5;

import java.util.Random;

public class L5Q2 {
    public static void main(String[] args) {
        Random rand = new Random();
        
        int[] num = new int[10];
        int count = 0;
        
         while (count < 10) {
            int number = rand.nextInt(21); 

            boolean isDuplicate = false;
            
            for (int i = 0; i < count; i++) {
                if (num[i] == number) {
                    isDuplicate = true;
                    break;
                }
                else{
                    continue;
                }
            }

            if (isDuplicate == false) {
                num[count] = number;
                count++;
            }
            else{
                continue;
            }
        }
        
        for (int j = 0; j < count; j++){
            System.out.println("Random number " + (j+1) + ": " + num[j]);
        }
    }
}
