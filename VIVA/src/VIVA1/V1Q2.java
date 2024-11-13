package VIVA1;

import java.util.Scanner;

public class V1Q2 {
    public static void main(String[] args) {
        Scanner abc = new Scanner(System.in);
        int steps = 0;
        int n = 0;
        int a = 0;
        int b = 0;
        do{
            System.out.print("Enter three integers : ");
            n = abc.nextInt();
            a = abc.nextInt();
            b = abc.nextInt();
        }while(n>Math.pow(10,9)&&n<1&&a>n&&a<1&&b>Math.pow(10,5)&&b<2);
        while ((n!=1)&&(n>0)){
            if(n%b==0){
                n/=b;
                steps++;}
            else {
               n-=a;
               steps++;}}
        if(n==1)
            System.out.println(steps);
        else
            System.out.println("-1");
    }
}
