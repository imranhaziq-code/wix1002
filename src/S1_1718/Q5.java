package S1_1718;

import java.io.*;
import java.util.*;

public class Q5 {
    public static void main(String[] args) {
        Apple r = new Apple("Apple", "Red", 8);
        System.out.println(r.toString());
        
        Apple g = new Apple("Apple", "Green", 11);
        System.out.println(g.toString());
        
        Watermelon l = new Watermelon("Watermelon", "Local", 7.6);
        System.out.println(l.toString());
        
        Watermelon i = new Watermelon("Watermelon", "Imported", 4.0);
        System.out.println(i.toString());
        
        System.out.println("The cheapest item is");
        
        if ((r.totalPrice() < g.totalPrice()) && (r.totalPrice() < l.totalPrice()) && (r.totalPrice() < i.totalPrice())) {
            System.out.println(r.toString());
        }
        else if ((g.totalPrice() < r.totalPrice()) && (g.totalPrice() < l.totalPrice()) && (g.totalPrice() < i.totalPrice())) {
            System.out.println(g.toString());
        }
        else if ((l.totalPrice() < g.totalPrice()) && (l.totalPrice() < r.totalPrice()) && (l.totalPrice() < i.totalPrice())) {
            System.out.println(l.toString());
        }
        else {
            System.out.println(i.toString());
        }
    }
}

abstract class Fruit {
    protected String fruitName;
    protected String fruitType;
    
    public Fruit(String fruitName, String fruitType) {
        this.fruitName = fruitName;
        this.fruitType = fruitType;
    }
    
    public abstract double totalPrice();
    
    public String toString() {
        return fruitType + " " + fruitName;
    }
}

class Apple extends Fruit {
    private int quantity;
    
    public Apple(String fruitName, String fruitType, int quantity) {
        super(fruitName, fruitType);
        this.quantity = quantity;
    }
    
    @Override
    public double totalPrice() {
        if (fruitType.equalsIgnoreCase("red"))
            return quantity * 1.80;
        else if (fruitType.equalsIgnoreCase("green")) 
            return quantity * 1.20;
        else
            return 0;
    }
    
    @Override
    public String toString() {
        return super.toString() + " - " + quantity + " = RM " + totalPrice();
    }
}

class Watermelon extends Fruit {
    private double weight;
    
    public Watermelon(String fruitName, String fruitType, double weight) {
        super(fruitName, fruitType);
        this.weight = weight;
    }
    
    @Override
    public double totalPrice() {
        if (fruitType.equalsIgnoreCase("local")) {
            if (weight < 2) {
                return weight * 2.25;
            }
            else if ((weight >= 2) && (weight <= 5)) {
                return weight * 1.95;
            }
            else {
                return weight * 1.65;
            }
        }
        else if (fruitType.equalsIgnoreCase("imported")) {
            if (weight < 2) {
                return weight * 3.75;
            }
            else if ((weight >= 2) && (weight <= 5)) {
                return weight * 3.45;
            }
            else {
                return weight * 3.15;
            }
        }
        else {
            return 0;
        }
    }
    
    @Override
    public String toString() {
        return super.toString() + " - " + weight + "kg = RM " + totalPrice();
    }
}