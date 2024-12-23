package T8;


public class T8Q2 {
    public static void main(String[] args) {
        Digit digit = new Digit(4567);
        
        digit.displayProduct();
    }
}

class Digit {
    private int num;
    
    public Digit(int num) {
        this.num = num;
    }
    
    public int digitMultiplication() {
        int product = 1;
        int temp = num;
        
        while (temp > 0) {
            product *= (temp %10);
            temp /= 10;
        }
        return product;
    }
    
    public void displayProduct() {
        System.out.println("The product of the digits: " + this.digitMultiplication());
    }
}

