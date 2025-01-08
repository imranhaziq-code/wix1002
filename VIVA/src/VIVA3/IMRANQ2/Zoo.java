package VIVA3.IMRANQ2;

public class Zoo {
    private Creature[] creatures;
    private int count;
    
    public Zoo(int size) {
        creatures = new Creature[size];
        count = 0;
    }
    
    public void addCreature(String species, double magicPower, String habitat) {
        if (count < creatures.length) {
            creatures[count] = new Creature(species, magicPower, habitat);
            count++;
            System.out.println(species + " added to the zoo.");
        } else {
            System.out.println("Zoo is full, cannot add more creatures.");
        }
    }

    public void feedCreature(String species, double foodAmount) {
        for (int i = 0; i < count; i++) {
            if (creatures[i].species.equals(species)) {
                creatures[i].feed(foodAmount);
                return;
            }
        }
        System.out.println("Creature with species " + species + " not found.");
    }

    public void displayAllCreatures() {
        for (int i = 0; i < count; i++) {
            creatures[i].displayInfo();
            System.out.println();
        }
    }
}
