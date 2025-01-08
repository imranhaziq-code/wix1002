package VIVA3.IMRANQ2;

public class Creature {
    public String species;
    private double magicPower;
    private String habitat;
    
    public Creature(String species, double magicPower, String habitat) {
        this.species = species;
        this.magicPower = magicPower;
        this.habitat = habitat;
    }
    
    public void feed(double foodAmount) {
        magicPower += foodAmount;
        System.out.println(species + " has been fed. Magic Power increased by " + foodAmount);
    }
    
    public void displayInfo() {
        System.out.println("Species: " + species);
        System.out.println("Magic Power: " + magicPower);
        System.out.println("Habitat: " + habitat);
    }
}
