package lsp;

public class Main {
    public static void main(String[] args) {
        // Using Liskov Substitution Principle (LSP) - Child classes can replace Parent class
        Payment creditCard = new CreditCardPayment();
        Payment paypal = new PayPalPayment();
        Payment upi = new UPIPayment();

        // Processing payments (LSP ensures all subclasses behave as expected)
        creditCard.processPayment(100.0);
        paypal.processPayment(150.0);
        upi.processPayment(200.0);
    }
}


// Output

// Processing a credit card payment of $100.0
// Processing a PayPal payment of $150.0
// Processing a UPI payment of $200.0
