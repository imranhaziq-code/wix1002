package VIVA3.IMRANQ1;

public class Potion {
    private String ingredient;
    private double volume;
    
    public Potion(String ingredient, double volume) {
        this.ingredient = ingredient;
        this.volume = volume;
    }
    
    public String getIngredient() {
        return ingredient;
    }
    
    public double getVolume() {
        return volume;
    }
    
    public void consume(double amount) {
        if (amount > volume) {
            System.out.println("\nAttempting to use " + amount + " ml of " + ingredient + "...");
            System.out.println("Not enough " + ingredient + " available.");
        } else {
            volume -= amount;
            System.out.println(amount + " ml of " + ingredient + " used.");
        }
    }
    
    public void printRemaining() {
        System.out.printf("Remaining volume of %s: %.2f ml%n", ingredient, volume);
    }
}
