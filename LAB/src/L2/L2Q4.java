package L2;

import java.util.Scanner; 

public class L2Q4 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Please enter the number of seconds: ");
        int totalSeconds = keyboard.nextInt();
        
        int hours = totalSeconds/(60*60);
        int remainingSeconds = totalSeconds%(60*60);
        int minutes = remainingSeconds/60;
        int seconds = remainingSeconds%60;
        
        System.out.println(+totalSeconds+" seconds is "+hours+" hours, "+minutes+" minutes and "+seconds+" seconds");
        
    }
    
}
