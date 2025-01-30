package dip;

public class Main {
    public static void main(String[] args) {
        // Injecting CreditCardPayment into PaymentProcessor
        Payment creditCard = new CreditCardPayment();
        PaymentProcessor processor1 = new PaymentProcessor(creditCard);
        processor1.makePayment(100.0);  // Processing Credit Card Payment

        // Injecting PayPalPayment into PaymentProcessor
        Payment paypal = new PayPalPayment();
        PaymentProcessor processor2 = new PaymentProcessor(paypal);
        processor2.makePayment(150.0);  // Processing PayPal Payment
    }
}
