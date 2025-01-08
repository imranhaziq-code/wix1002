package VIVA3.IMRANQ1;

public class PotionContainer {
    private Potion[] potions; 
    private int count; 

    public PotionContainer() {
        potions = new Potion[10]; 
        count = 0;
    }

    public void addPotion(String ingredient, double volume) {
        potions[count] = new Potion(ingredient, volume);
        System.out.println(volume + " ml of " + ingredient + " added to the container.");
        count++;
    }

    public void usePotion(String ingredient, double amount) {
        for (int i = 0; i < count; i++) {
            if (potions[i].getIngredient().equals(ingredient)) {
                potions[i].consume(amount);
                return;
            }
        }
        System.out.println("Potion not found: " + ingredient);
    }

    public double getRemainingVolume(String ingredient) {
        for (int i = 0; i < count; i++) {
            if (potions[i].getIngredient().equals(ingredient)) {
                return potions[i].getVolume();
            }
        }
        System.out.println("Potion not found: " + ingredient);
        return 0;
    }

    public boolean isEnoughForPotion(String[] requiredIngredients, double[] requiredVolumes) {
    for (int i = 0; i < requiredIngredients.length; i++) {
        double availableVolume = getRemainingVolume(requiredIngredients[i]);
        if (availableVolume < requiredVolumes[i]) {
            return false; 
        }
    }
    return true; 
}

    public void printPotions() {
        System.out.println("\n--- Potion Inventory ---");
        for (int i = 0; i < count; i++) {
            potions[i].printRemaining();
        }
    }
    
    public void useAndPrintPotion(String ingredient, double amount) {
        usePotion(ingredient, amount);
        System.out.println("Remaining volume of " + ingredient + ": " +
                getRemainingVolume(ingredient) + " ml");
    }

}
