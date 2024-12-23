package L8;

import java.util.Scanner;

public class L8Q3 {
    public static void main(String[] args) {
        WeightCalculator user1 = new WeightCalculator();
        user1.input();
        user1.displayUserInfo();
    }
}

class WeightCalculator {
    private int age;
    private double height;
    
    public void input() {
        Scanner keyboard  = new Scanner(System.in);
        System.out.print("Enter your age (years): ");
        age = keyboard.nextInt();
        System.out.print("Enter your height (cm): ");
        height = keyboard.nextDouble();
    }
    
    
    private double WeightCalculate() {
        double recWeight;
        recWeight = (height - 100 + age / 10) * 0.9;
        return recWeight;
    }
    
    public void displayUserInfo() {
        System.out.println("User's age (years): " + age);
        System.out.println("User's height (cm): " + height);
        System.out.printf("Recommended weight (kg): %.2f\n", WeightCalculate());
    }
}
