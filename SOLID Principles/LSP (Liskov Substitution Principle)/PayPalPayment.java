package lsp;

public class PayPalPayment extends Payment {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing a PayPal payment of $" + amount);
    }
}
