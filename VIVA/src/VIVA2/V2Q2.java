package VIVA2;

import java.util.Scanner;

public class V2Q2 {
    static void calculateCircleArea(double radius){
        double areaCircle = Math.PI*Math.pow(radius, 2);
        System.out.printf("the area of a circle is: %.2f " , areaCircle);
        System.out.println();
        
    }
    
    static void calculateRectangleArea(double length, double width){
        double area = length * width;
        System.out.printf("the area of this rectangle is : %.2f" , area );
         System.out.println();
    }
    
    static void  calculateTriangleArea(double base, double height){
        double Trianglearea = (base * height) / 2 ;
        System.out.printf("the area of this triangle is : %.2f" , Trianglearea );
         System.out.println();
    }
    
    public static void main(String[] args) {
        Scanner ariff = new Scanner(System.in);
      
      for ( int i = 0 ; i < 3 ; i++){
      System.out.println("choose the shape to calculate the area: ");
      System.out.println("""
                         1. Circle
                         2. Rectangle
                         3. Triangle
      """);
      System.out.print("Enter your choice : ");
      int shape = ariff.nextInt();
      switch (shape){
          case 1 :
          System.out.print("enter the radius of the circle : ");
      double radius = ariff.nextDouble();
      calculateCircleArea(radius);
      break;
      
          case 2 :
        System.out.print("enter the length of the rectangle : ");
        double length = ariff.nextDouble();
        System.out.print("enter the length of the rectangle : ");
        double width = ariff.nextDouble(); 
        calculateRectangleArea(length, width);
        break;
        
          case 3 :
        System.out.print("enter the base of the triangle :");
        double base = ariff.nextDouble();
         System.out.print("enter the base of the triiangle :");
        double height = ariff.nextDouble();
        calculateTriangleArea(base,height);
        break;
        
          default :
              System.out.print("choose 1 to 3!");
              break;
      }
      }
    }
}
