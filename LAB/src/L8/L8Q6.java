package L8;

public class L8Q6 {
    public static void main(String[] args) {
        BurgerStall stall1 = new BurgerStall("Stall 1", 50);
        BurgerStall stall2 = new BurgerStall("Stall 2", 75);
        BurgerStall stall3 = new BurgerStall("Stall 3", 30);

        stall1.sold(20);
        stall2.sold(10);
        stall3.sold(40);

        stall1.display();
        stall2.display();
        stall3.display();
        
        BurgerStall.displayTotal();
    }
}

class BurgerStall {
    private String stallID;  
    private int burgersSold;  
    private static int totalBurgersSold = 0;  

    
    public BurgerStall(String stallID, int initialBurgersSold) {
        this.stallID = stallID;
        this.burgersSold = initialBurgersSold;
        totalBurgersSold += initialBurgersSold;  
    }

    
    public void sold(int additionalBurgers) {
        this.burgersSold += additionalBurgers;
        totalBurgersSold += additionalBurgers;  
    }

    
    public void display() {
        System.out.println("Stall ID: " + stallID);
        System.out.println("Burgers Sold at " + stallID + ": " + burgersSold);
        System.out.println("");
    }

    
    public static void displayTotal() {
        System.out.println("Total Burgers Sold Across All Stalls: " + totalBurgersSold);
    }
}