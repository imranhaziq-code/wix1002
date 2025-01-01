package L9;

import java.util.Scanner;

public class L9Q1 {
    public static void main(String[] args) {
        // Test Rectangle
        Rectangle rectangle = new Rectangle();
        rectangle.acceptInput();
        rectangle.computePerimeterAndArea();
        rectangle.display();

        // Test Square
        Square square = new Square();
        square.acceptInput();
        square.computePerimeterAndArea();
        square.display();

        // Test Circle
        Circle circle = new Circle();
        circle.acceptInput();
        circle.computePerimeterAndArea();
        circle.display();
    }
}

class Shape {
    private String name;
    private double perimeter;
    private double area;

    public Shape(String name) {
        this.name = name;
    }

    public double getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public void display() {
        System.out.printf("\nShape: %s\nPerimeter: %.2f\nArea: %.2f\n", name, perimeter, area);
    }
}

class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle() {
        super("Rectangle");
    }

    public void acceptInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of the rectangle: ");
        length = scanner.nextDouble();
        System.out.print("Enter the width of the rectangle: ");
        width = scanner.nextDouble();
    }

    public void computePerimeterAndArea() {
        setPerimeter(2 * (length + width));
        setArea(length * width);
    }
}

class Square extends Shape {
    private double side;

    public Square() {
        super("Square");
    }

    public void acceptInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter the side length of the square: ");
        side = scanner.nextDouble();
    }

    public void computePerimeterAndArea() {
        setPerimeter(4 * side);
        setArea(side * side);
    }
}

class Circle extends Shape {
    private double diameter;

    public Circle() {
        super("Circle");
    }

    public void acceptInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter the diameter of the circle: ");
        diameter = scanner.nextDouble();
    }

    public void computePerimeterAndArea() {
        double radius = diameter / 2;
        setPerimeter(2 * Math.PI * radius);
        setArea(Math.PI * radius * radius);
    }
}

