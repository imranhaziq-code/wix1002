package L8;

public class L8Q7 {
    public static void main(String[] args) {
        Money money1 = new Money(10.11);  
        Money money2 = new Money(10.13);  

        System.out.println("Initial amounts:");
        money1.displayAmount();
        money2.displayAmount();

        System.out.println("\nCurrency breakdown:");
        System.out.println("Money1:");
        money1.calculateCurrency();
        System.out.println("Money2:");
        money2.calculateCurrency();

        System.out.println("\nAfter adding 10.13 to Money1:");
        money1.add(10.13);
        money1.displayAmount();
        money1.calculateCurrency();

        System.out.println("\nAfter subtracting 5.05 from Money1:");
        money1.subtract(5.05);
        money1.displayAmount();
        money1.calculateCurrency();
    }
}

class Money {
    private double amount;
    private final double[] notes = {100, 50, 10, 5, 1};  
    private final double[] coins = {0.50, 0.20, 0.10, 0.05};  
    private final String[] noteNames = {"RM100", "RM50", "RM10", "RM5", "RM1"};
    private final String[] coinNames = {"50 Cent", "20 Cent", "10 Cent", "5 Cent"};

    public Money(double amount) {
        this.amount = roundAmount(amount);
    }

    private double roundAmount(double amount) {
        double roundedAmount = Math.round(amount * 20) / 20.0; 
        return Math.round(roundedAmount * 100) / 100.0; 
    }

    public void calculateCurrency() {
        double remainingAmount = amount;

        for (int i = 0; i < notes.length; i++) {
            int count = (int) (remainingAmount / notes[i]);
            remainingAmount -= count * notes[i];
            remainingAmount = Math.round(remainingAmount * 100) / 100.0; 
            System.out.println(noteNames[i] + ": " + count);
        }

        for (int i = 0; i < coins.length; i++) {
            int count = (int) (remainingAmount / coins[i]);
            remainingAmount -= count * coins[i];
            remainingAmount = Math.round(remainingAmount * 100) / 100.0; 
            System.out.println(coinNames[i] + ": " + count);
        }

        System.out.println("");  
    }

    public void add(double additionalAmount) {
        this.amount += additionalAmount;
        if (this.amount < 0) {
            this.amount = 0; 
        }
        this.amount = roundAmount(this.amount); 
    }

    public void subtract(double subtractionAmount) {
        this.amount -= subtractionAmount;
        if (this.amount < 0) {
            this.amount = 0; 
        }
        this.amount = roundAmount(this.amount); 
    }

    public void displayAmount() {
        System.out.println("Amount: RM" + String.format("%.2f", amount));
    }
}
