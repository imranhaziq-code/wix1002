package VIVA3.EDLANQ6;

import java.util.Random;

public class Game {
   public void battle(Team team, Villain enemy) {
        team.resetTeamHp();
        enemy.resetHp();
        enemy.resetCd();

        Random random = new Random();
        boolean battleOngoing = true;
        int round = 1;
        while (battleOngoing) {
    // Generate 3 random runestones
    String[] runestones = {"Water", "Fire", "Earth", "Light", "Dark"};
    int[] runestoneCount = new int[runestones.length]; // Count of each runestone type
    for (int i = 0; i < 3; i++) {
        int index = random.nextInt(runestones.length);
        runestoneCount[index]++;
    }
    System.out.println("Round " + round);
    System.out.println("Enemy's current CD: " + enemy.getCurrentCd());
    System.out.println("Runestones dissolved: ");
    for (int i = 0; i < runestones.length; i++) {
        if (runestoneCount[i] > 0) {
            int k = runestoneCount[i];
            while(k>0){
            System.out.println("-" + runestones[i]);
            k--;
        }}
    }

    // Heroes attack based on runestones
    for (Hero hero : team.getHeroList()) {
        if (hero != null) {
            // Check if the hero's element matches any of the runestones
            int runestoneIndex = getRunestoneIndex(hero.getElement(), runestones);
            if (runestoneIndex != -1 && runestoneCount[runestoneIndex] > 0) {
                int runestoneMultiplier = runestoneCount[runestoneIndex];
                double dominanceMultiplier = getDominanceMultiplier(hero.getElement(), enemy.getElementv());
                double damage = (hero.getAttack() * dominanceMultiplier * runestoneMultiplier) - enemy.getDefense();
                damage = Math.max(damage, 1); // Ensure at least 1 damage
                System.out.println(hero.getName() + " dealt " + damage + " damage to " + enemy.getNamev());
                enemy.getDamagedv(damage);
            }
        }
    }

    // Enemy attacks the team if currentCd is 1
    if (enemy.getCurrentCd() == 1 && enemy.getHp() > 0) {
        double enemyDamage = enemy.getAttackv(); // Enemy deals damage equal to its attack
        System.out.println(enemy.getNamev() + " dealt " + enemyDamage + " damage to the team");
        team.getDamaged(enemyDamage);
        enemy.resetCd(); // Reset cooldown after attacking
    } else {
        enemy.decreaseCd(); // Decrease cooldown if not attacking
    }

    System.out.println("Team's remaining HP: " + team.getHp());
    System.out.println("Enemy's remaining HP: " + enemy.getHp());

    // Check for battle outcome
    if (enemy.getHp() <= 0) {
        System.out.println("The team wins the battle!");
        battleOngoing = false;
    } else if (team.getHp() <= 0) {
        System.out.println("The team loses the battle!");
        battleOngoing = false;
    }
    round++;
    System.out.println(" ");
}
    }

    // Method to get the index of the runestone based on the element
    private int getRunestoneIndex(String element, String[] runestones) {
        for (int i = 0; i < runestones.length; i++) {
            if (runestones[i].equalsIgnoreCase(element)) {
                return i;
            }
        }
        return -1; // Return -1 if the element is not found
    } 

    // Method to get the dominance multiplier based on elements ```java
    private double getDominanceMultiplier(String attackerElement, String defenderElement) {
        if (attackerElement.equals("Earth") && defenderElement.equals("Water")) {
            return 1.5;
        } else if (attackerElement.equals("Water") && defenderElement.equals("Earth")) {
            return 0.5;
        } else if (attackerElement.equals("Water") && defenderElement.equals("Fire")) {
            return 1.5;
        } else if (attackerElement.equals("Fire") && defenderElement.equals("Water")) {
            return 0.5;
        } else if (attackerElement.equals("Earth") && defenderElement.equals("Fire")) {
            return 0.5;
        } else if (attackerElement.equals("Light") && defenderElement.equals("Dark")) {
            return 1.5;
        } else if (attackerElement.equals("Dark") && defenderElement.equals("Light")) {
            return 1.5;
        }
        return 0; // Default multiplier if no dominance is found
    }
}
