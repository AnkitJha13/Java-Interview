package lsp;

public class UPIPayment extends Payment {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing a UPI payment of $" + amount);
    }
}
