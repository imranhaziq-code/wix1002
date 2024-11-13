package VIVA1;

import java.util.Scanner;

public class V1Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);        

        int choice;
        int order;
        double total = 0.0;
        boolean orderedPizza = false;
        boolean orderedDrinks = false;
        boolean orderedDessert = false;

    while (true) {
        System.out.println("""
                          Welcome to Maroni's Pizza!
                          1. Pizza
                          2. Drinks
                          3. Dessert
                          4. CHECKOUT
                           
                          Pick an option: """);
        choice = sc.nextInt();
        
        // Pizza Menu 
        if (choice == 1) {
        while (true) {
            System.out.println("""
                               
                               PIZZA
                               1 Chicken Pepperoni - RM15
                               2 Chicken Supreme - RM18
                               3 Vegan Indulgence - RM12
                               4 Beef Delight - RM22
                               5 Margherita - RM9
                               6 BACK TO MAIN MENU
                               
                               Pick an option:  """);
            order = sc.nextInt();
            
            if (order == 1) {
                        total += 15;
                        orderedPizza = true;
                        System.out.println("Added Chicken Pepperoni");
                        System.out.println("Current total: RM" + total);
            } else if (order == 2) { 
                        total += 18;
                        orderedPizza = true;
                        System.out.println("Added Chicken Supreme");
                        System.out.println("Current total: RM" + total);
            } else if (order == 3) {
                        total += 12;
                        orderedPizza = true;
                        System.out.println("Added Vegan Indulgence");
                        System.out.println("Current total: RM" + total);
            } else if (order == 4) {
                        total += 22;
                        orderedPizza = true;
                        System.out.println("Added Beef Delight");
                        System.out.println("Current total: RM" + total);
            } else if (order == 5) {
                        total += 9;
                        orderedPizza = true;
                        System.out.println("Added Margherita");
                        System.out.println("Current total: RM" + total);
            } else if (order == 6) {
                System.out.println("");
                break;
            }else {
                System.out.println("Invalid input. Please insert a number from 1 to 6.");
        }
    }
}
        // Drinks Menu
        else if (choice == 2) {
            while (true) {
                System.out.println("""
                                   
                                   DRINKS
                                   
                                   1 Strawberry Smoothie - RM8
                                   2 Banana Smoothie - RM8
                                   3 Mocktail - RM12
                                   4 Soft Drink - RM5
                                   5 Mineral Water - RM3
                                   6 BACK TO MAIN MENU
                                   
                                   Pick an option: """);
                order = sc.nextInt();
                
                if (order == 1) {
                        total += 8;
                        orderedDrinks = true;
                        System.out.println("Added Strawberry Smoothie");
                        System.out.println("Current total: RM" + total);
                } else if (order == 2) {
                        total += 8;
                        orderedDrinks = true;
                        System.out.println("Added Banana Smoothie");
                        System.out.println("Current total: RM" + total);
                } else if (order == 3) {
                        total += 12;
                        orderedDrinks = true;
                        System.out.println("Added Mocktail");
                        System.out.println("Current total: RM" + total);
                } else if (order == 4) {
                        total += 5;
                        orderedDrinks = true;
                        System.out.println("Added Soft Drink");
                        System.out.println("Current total: RM" + total);
                } else if (order == 5) {
                        total += 3;
                        orderedDrinks = true;
                        System.out.println("Added Mineral Water");
                        System.out.println("Current total: RM" + total);
                } else if (order == 6) {
                    System.out.println("");
                        break;
                } else {
                        System.out.println("Invalid input. Please insert a number from 1 to 6.");
                } 
                }
            }
        
        // Dessert Menu
        else if (choice == 3) {
            while (true) {
                System.out.println("""
                                   
                                   DESSERT
                                   
                                   1 Tiramisu - RM7
                                   2 Strawberry Shortcake - RM10
                                   3 Green Jello - RM4
                                   4 Creme Brulee - RM15
                                   5 Raspberry Pie - RM20
                                   6 BACK TO MAIN MENU
                                   
                                   Pick an option: """);
                order = sc.nextInt();
                
                if (order == 1) {
                    total += 7;
                    orderedDessert = true;
                    System.out.println("Added Tiramisu");
                    System.out.println("Current total: RM" + total);
                } else if (order == 2) {
                    total += 10;
                    orderedDessert = true;
                    System.out.println("Added Strawberry Shortcake");
                    System.out.println("Current total: RM" + total);
                } else if (order == 3) {
                    total += 4;
                    orderedDessert = true;
                    System.out.println("Added Green Jello");
                    System.out.println("Current total: RM" + total);
                } else if (order == 4) {
                    total += 15;
                    orderedDessert = true;
                    System.out.println("Added Creme Brulee");
                    System.out.println("Current total: RM" + total);
                } else if (order == 5) {
                    total += 20;
                    orderedDessert = true;
                    System.out.println("Added Raspberry Pie");
                    System.out.println("Current total: RM" + total);
                } else if (order == 6) {
                    System.out.println("");
                    break;
                } else {
                System.out.println("Invalid input. Please insert a number from 1 to 6.");
        }
            }
        }
    
        // Checkout
        else if (choice == 4) {
        
        if (orderedPizza && orderedDrinks && orderedDessert) {
            System.out.printf("Your total is: RM%.2f\n", total);
            total *= 0.8;
            System.out.println("You've availed the One-of-each offer. You get a 20% discount!");
            System.out.printf("Your new total is: RM%.2f\n", total);
            System.out.println("");
            System.out.println("Have a nice day!");
        }
        else {
            System.out.printf("Your total is: RM%.2f\n", total);
            System.out.println("Have a nice day!");
        }
        break;
        }
    } 
    }
}
