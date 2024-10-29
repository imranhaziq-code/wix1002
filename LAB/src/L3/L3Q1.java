
package L3;

import java.util.Scanner;

public class L3Q1 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Enter two integer number: ");
        int num1 = keyboard.nextInt();
        int num2 = keyboard.nextInt();
        
        System.out.print("Enter the operand: ");
        char operand = keyboard.next().charAt(0);
        
        switch(operand){
            case '+':
                System.out.println(num1+" "+operand+" "+num2+" = "+(num1+num2));
                break;
            case '-':
                System.out.println(num1+" "+operand+" "+num2+" = "+(num1-num2));
                break;
            case '*':
                System.out.println(num1+" "+operand+" "+num2+" = "+(num1*num2));
                break;
            case '/':
                if (num2 != 0) {
                    System.out.println(num1+" "+operand+" "+num2+" = "+(num1/num2));
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            case '%':
                if (num2 != 0) {
                    System.out.println(num1+" "+operand+" "+num2+" = "+(num1%num2));
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Error: Invalid operator.");
                break;
        }
    }
    
}
