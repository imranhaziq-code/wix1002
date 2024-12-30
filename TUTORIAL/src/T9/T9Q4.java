package T9;

public class T9Q4 {
    public static void main(String[] args) {
        System.out.println("PurchaseSystem Test:");
        PurchaseSystem purchase = new PurchaseSystem("P001", 2.5, 10);
        purchase.compute();
        purchase.display();
        
        System.out.println("\nSugarPurchase Test:");
        SugarPurchase sugarPurchase = new SugarPurchase("S001", 3.0, 5, 1.2);
        sugarPurchase.compute();
        sugarPurchase.display();
    }
}

class PurchaseSystem {
    private String productCode;
    private double unitPrice;
    private int quantity;
    protected double totalPrice;
    
    public PurchaseSystem(String pc, double up, int q){
        productCode = pc;
        unitPrice = up;
        quantity = q;
    }
    
    public void compute() {
        totalPrice = unitPrice * quantity;
    }
    
    public void display() {
        System.out.println("Total Price: RM" + totalPrice);
        
    }
}

class SugarPurchase extends PurchaseSystem {
    private double sugarWeight;
    
    public SugarPurchase(String pc, double up, int q, double sw) {
        super(pc, up, q);
        sugarWeight = sw;
    }
    
    @Override
    public void compute() {
        super.compute();
        totalPrice *= sugarWeight;
    }
}

