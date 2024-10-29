package L3;

import java.util.Scanner;

public class L3Q5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a: ");
        double a = input.nextDouble();
        
        System.out.print("Enter b: ");
        double b = input.nextDouble();
        
        System.out.print("Enter c: ");
        double c = input.nextDouble();
        
        System.out.print("Enter d: ");
        double d = input.nextDouble();
        
        System.out.print("Enter e: ");
        double e = input.nextDouble();
        
        System.out.print("Enter f: ");
        double f = input.nextDouble();

        double denominator = a * d - b * c;

        if (denominator == 0) {
            System.out.println("The equation has no solution");
        } else {
            double x = (e * d - b * f) / denominator;
            double y = (a * f - e * c) / denominator;

            System.out.println("x = " + x);
            System.out.println("y = " + y);
        }
    }
}
