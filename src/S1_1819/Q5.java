package S1_1819;

import java.util.*;
import java.io.*;

public class Q5 {
    public static void main(String[] args) {
        SpecialDelivery a = new SpecialDelivery("Ali", "Ahmad", 4.4, false, false);
        System.out.println(a.toString());
        
        System.out.println("");
        
        SpecialDelivery b = new SpecialDelivery("Ah Chong", "Fatimah", 63.1, false, false);
        System.out.println(b.toString());
        
        System.out.println("");
        
        SpecialDelivery c = new SpecialDelivery("FSKTM, UM", "FK, UM", 32.5, true, false);
        System.out.println(c.toString());
        
        System.out.println("");
        
        SpecialDelivery d = new SpecialDelivery("Ang", "Liew", 19.0, true, true);
        System.out.println(d.toString());
        
        double total = a.totalCost() + b.totalCost() + c.totalCost() + d.totalCost();
        System.out.println("\nThe total shipping cost is RM " + total);
        
    }
}

class Delivery {
    private String sender;
    private String recipient;
    private double weight;
    
    public Delivery(String sender, String recipient, double weight) {
        this.sender = sender;
        this.recipient = recipient;
        this.weight = weight;
    }
    
    public double totalCost() {
        if (weight <= 5) {
            return weight * 2.80;
        }
        else if ((weight > 5) && (weight <= 20)) {
            return ((weight - 5) * 5.20) + ((5 * 2.80));
        }
        else if ((weight > 20) && (weight <= 50)) {
            return (((weight - 20) * 7) + (5 * 2.80) + (15 * 5.20));
        }
        else {
            return (((weight - 50) * 8.60) + (5 * 2.80) + (15 * 5.20) + (30 * 7));
        }
    }
    
    public String toString() {
        return "From : " + sender + " To: " + recipient + "\nWeight of Package : " + weight + " kg\nShipping Cost : RM" + totalCost();
    }
}

class SpecialDelivery extends Delivery {
    private boolean weekend;
    private boolean nighttime;
    
    public SpecialDelivery(String sender, String recipient, double weight, boolean weekend, boolean nighttime) {
        super(sender, recipient, weight);
        this.weekend = weekend;
        this.nighttime = nighttime;
    }
    
    @Override
    public double totalCost() {
        if (weekend && nighttime) {
            return (super.totalCost() + 50) + (0.2 * (super.totalCost() + 50));
        }
        else if (weekend) {
            return super.totalCost() + 50;
        }
        else if (nighttime) {
            return super.totalCost() + (0.2 * super.totalCost());
        }
        else {
            return super.totalCost();
        }
    }
    
    @Override
    public String toString() {
        if (weekend & nighttime) {
            return super.toString() + "\nWeekend Delivery\nNight Time Delivery";
        }
        else if (weekend) {
            return super.toString() + "\nWeekend Delivery";
        }
        else if (nighttime) {
            return super.toString() + "\nNight Time Delivery";
        }
        else {
            return super.toString();
        }
    }
}