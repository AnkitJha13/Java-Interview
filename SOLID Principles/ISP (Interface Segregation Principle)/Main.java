package isp;

public class Main {
    public static void main(String[] args) {
        // Processing credit card payment
        CreditCardPayment creditCard = new CreditCardPaymentImpl();
        creditCard.processCreditCardPayment(100.0);

        // Processing PayPal payment using Digital Wallet
        PayPalPayment digitalWalletPayPal = new DigitalWalletPayment();
        digitalWalletPayPal.processPayPalPayment(150.0);

        // Processing UPI payment using Digital Wallet
        UPIPayment digitalWalletUPI = new DigitalWalletPayment();
        digitalWalletUPI.processUPIPayment(200.0);
    }
}


// Output

// Processing credit card payment of $100.0
// Processing PayPal payment of $150.0
// Processing UPI payment of $200.0
