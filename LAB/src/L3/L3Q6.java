package L3;

import java.util.Scanner;

public class L3Q6 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Please enter radius of a circle: ");
        double radius = keyboard.nextDouble();
        
        System.out.print("Enter coordinate x: ");
        double x = keyboard.nextDouble();
        
        System.out.print("Enter coordinate y: ");
        double y = keyboard.nextDouble();
        
        double distance = Math.sqrt((x*x)+(y*y));
        
        if (distance <= radius){
            System.out.println("The point ("+x+", "+y+") is inside the circle.");
        }
        else{
            System.out.println("The point ("+x+", "+y+") is outside the circle.");        
                    }
    }
}
