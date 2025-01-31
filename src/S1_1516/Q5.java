package S1_1516;

import java.util.*;
import java.io.*;

public class Q5 {
    public static void main(String[] args) {
        Rebate r = new Rebate("John Lim","1111222233334444");
        Point p = new Point("John Lim", "5555444433332222");
        r.payment("grocery", 124.8);
        r.payment("other", 64.60);
        r.payment("fuel", 95.40);
        r.payment("utility", 100);
        r.payment("other", 220);
        System.out.print(r.toString());
        
        p.payment("saturday", 124.80);
        p.payment("friday", 64.6);
        p.payment("sunday", 95.4);
        p.payment("friday", 100);
        p.payment("tuesday", 220);
        System.out.println(p.toString());

	if (r.getReward()>p.getReward())
            System.out.println("The best card is Cash Rebate Card.");
        else
            System.out.println("The best card is Point Reward Card.");

    }
}

class CreditCard {
    private String name;
    private String cardNum;
    private String cardType;
    protected double totalCashReward;
    
    public CreditCard(String name, String cardNum, String cardType) {
        this.name = name;
        this.cardNum = cardNum;
        this.cardType = cardType;
    }
    
    public double getTotalCashReward() {
        return totalCashReward;
    }
    
    public void setTotalCashReward(double totalCashReward) {
        this.totalCashReward = totalCashReward;
    }
    
    public String toString() {
        return "Card Holder's Name: " + name + " (" + cardNum + ")\nCard Type: " + cardType + "\nTotal Cash Reward: " + totalCashReward + "\n";
    }
}

class Rebate extends CreditCard {
    public Rebate(String name, String cardNum) {
        super(name, cardNum, "Cash Rebate");
    }
    
    public double payment(String item, double price){
        
        if (item.equalsIgnoreCase("fuel"))
            return totalCashReward += price * 0.08;
        else if (item.equalsIgnoreCase("utility"))
            return totalCashReward += price * 0.05;
        else if (item.equalsIgnoreCase("grocery"))
            return totalCashReward += price * 0.02;
        else
            return totalCashReward += price * 0.002;
    }
    
    public double getReward(){
        return totalCashReward;
    }
}

class Point extends CreditCard {
    private double point;
    
    public Point(String name, String cardNum) {
        super(name, cardNum, "Point Reward");
    }
    
    public double payment(String day, double price) {
        this.point = (int)price ;
        point = point / 100;
        
        if (day.equalsIgnoreCase("friday")) {
            return totalCashReward += (point * 2);
        }
        else if (day.equalsIgnoreCase("saturday")) {
            return totalCashReward += (point * 3);
        }
        else if (day.equalsIgnoreCase("sunday")) {
            return totalCashReward += (point * 4);
        }
        else {
            return totalCashReward += point;
        }
    }
    
    public double getReward() {
        return totalCashReward;
    }
}
