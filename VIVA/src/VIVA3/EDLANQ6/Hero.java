package VIVA3.EDLANQ6;

public class Hero {
    private String name;
    private String element;
    private int healthPoints;
    private int attack;

    public Hero(String name, String element, int healthPoints, int attack) {
        this.name = name;
        this.element = element;
        this.healthPoints = healthPoints;
        this.attack = attack;
    }

    public String toString() {
        return "Name: " + name + "\nElement: " + element + "\nHP: " + healthPoints + "\nAttack: " + attack;
    }

    public String getName() {
        return name;
    }

    public String getElement() {
        return element;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public int getAttack() {
        return attack;
    }
}
