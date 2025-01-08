package VIVA3.EDLANQ6;

import java.util.Random;

public class Team {
    private Hero[] deck;
    private Hero[] heroList;
    private int hp;
    public Team(Hero[] deck) {
        this.deck = deck;
        this.heroList = new Hero[4];
        this.hp = 0;
    }
    public void formTeam() {
        boolean[] selected = new boolean[deck.length]; // Track selected heroes
        int count = 0;
        Random random = new Random();
        while (count < 4 && count < deck.length) {
            int index = random.nextInt(deck.length);
            if (!selected[index]) { // Ensure no duplicates
                heroList[count] = deck[index]; // Add hero to the team
                selected[index] = true; // Mark this hero as selected
                count++;
            }
        }
        hp = 0;
        for (int i = 0; i < count; i++) {
            hp += heroList[i].getHealthPoints();
        }
    }
    public void getDamaged(double damage) {
        hp -= damage;
        if (hp < 0) {
            hp = 0;
        }
    }
    public void resetTeamHp() {
        hp = 0;
        for (int i = 0; i < 4; i++) {
            if (heroList[i] != null) {
                hp += heroList[i].getHealthPoints();
            }
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Team's HP: ").append(hp).append("\n\n");
        for (int i = 0; i < 4; i++) {
            if (heroList[i] != null) { // Check if the hero is selected
                sb.append("Hero ").append(i + 1).append("\n").append(heroList[i].toString()).append("\n\n");
            }
        }
        return sb.toString();
    }

    public Hero[] getHeroList() {
        return heroList;
    }

    public int getHp() {
        return hp;
    }
}
