package L6;

public class L6Q4 {
    
    public static int gcd(int quotient, int divisor) {
        while (divisor != 0) {
            int temp = divisor;
            divisor = quotient % divisor;  
            quotient = temp;   
        }
        return quotient;  
    }
    
    public static void main(String[] args) {
        System.out.println("GCD of 24 and 8: " + gcd(24, 8));
        System.out.println("GCD of 200 and 625: " + gcd(200, 625));
    }
}

