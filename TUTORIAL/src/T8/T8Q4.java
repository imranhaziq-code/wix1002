package T8;


public class T8Q4 {
    public static void main(String[] args) {
        Payment payment = new Payment();

        // Test cash payment
        payment.makePayment(100.50);

        // Test cheque payment
        payment.makePayment(250.75, "CHK123456");

        // Test credit card payment
        payment.makePayment(500.00, "John Doe", "Visa", "12/25", "123");
    }
}

class Payment {
    // Method for cash payment
    public void makePayment(double cashAmount) {
        System.out.println("Cash Payment:");
        System.out.println("Amount: RM " + cashAmount);
    }

    // Method for cheque payment
    public void makePayment(double chequeAmount, String chequeNumber) {
        System.out.println("Cheque Payment:");
        System.out.println("Amount: RM " + chequeAmount);
        System.out.println("Cheque Number: " + chequeNumber);
    }

    // Method for credit card payment
    public void makePayment(double cardAmount, String cardHolderName, String cardType, String expirationDate, String validationCode) {
        System.out.println("Credit Card Payment:");
        System.out.println("Amount: RM " + cardAmount);
        System.out.println("Card Holder: " + cardHolderName);
        System.out.println("Card Type: " + cardType);
        System.out.println("Expiration Date: " + expirationDate);
        System.out.println("Validation Code: " + validationCode);
    }
}
