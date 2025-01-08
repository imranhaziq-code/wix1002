package VIVA3.IMRANQ1;

public class V3Q1 {
    public static void main(String[] args) {
        PotionContainer container = new PotionContainer();

        System.out.println("Adding potions to the container...");
        container.addPotion("Unicorn Tears", 200.0);
        container.addPotion("Dragon Blood", 150.0);
        System.out.println("Potion container successfully initialized.\n");

        System.out.println("=== Using Potions ===");
        container.useAndPrintPotion("Unicorn Tears", 50.0);
        container.useAndPrintPotion("Dragon Blood", 30.0);

        container.useAndPrintPotion("Dragon Blood", 200.0);

        System.out.println("\n=== Checking Potion Availability for Invisibility Draught ===");
        String[] requiredIngredients = {"Unicorn Tears", "Dragon Blood"};
        double[] requiredVolumes = {200.0, 150.0};
        boolean readyForInvisibilityDraught = container.isEnoughForPotion(requiredIngredients, requiredVolumes);

        System.out.println("\nCan prepare Invisibility Draught?");
        if (readyForInvisibilityDraught) {
            System.out.println("Yes, we have enough ingredients for the potion!");
        } else {
            System.out.println("No, we do not have enough ingredients for the potion.");
        }

        System.out.println("\nFinal state of the potion container:");
        container.printPotions();
    }
}
