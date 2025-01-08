package VIVA3.EDLANQ6;

public class Villain {
    private String namev;
    private String elementv;
    private int maxHp;
    private double hp;
    private int attackv;
    private int defense;
    private int initialCd;
    private int currentCd;
    public Villain(String name, String element, int maxHp, int attack, int defense, int initialCd) {
        this.namev = name;
        this.elementv = element;
        this.maxHp = maxHp;
        this.hp = maxHp;
        this.attackv = attack;
        this.defense = defense;
        this.initialCd = initialCd;
        this.currentCd = 0;
    }
    public void getDamagedv(double damage) {
        if (damage < 0) {
            damage = 1;
        }
        this.hp -= damage;
        if (this.hp < 0) {
            this.hp = 0;
        }
    }
    public void resetHp() {
        this.hp = maxHp;
    }
    public void decreaseCd() {
        if (currentCd > 0) {
            currentCd--;
        }
    }
    public void resetCd() {
        currentCd = initialCd;
    }

    public String toString() {
        return "Villain Name: " + namev + "\nElement: " + elementv + "\nMax HP: " + maxHp + "\nCurrent HP: " + hp + "\nAttack: " + attackv +
                "\nDefense: " + defense + "\nInitial Cooldown: " + initialCd + "\nCurrent Cooldown: " + currentCd;
    }

    public String getNamev() {
        return namev;
    }

    public String getElementv() {
        return elementv;
    }

    public int getMaxHp() {
        return maxHp;
    }

    public double getHp() {
        return hp;
    }

    public int getAttackv() {
        return attackv;
    }

    public int getDefense() {
        return defense;
    }

    public int getInitialCd() {
        return initialCd;
    }

    public int getCurrentCd() {
        return currentCd;
    }
}
