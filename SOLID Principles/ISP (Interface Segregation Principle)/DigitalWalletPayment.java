package isp;

public class DigitalWalletPayment implements PayPalPayment, UPIPayment {
    @Override
    public void processPayPalPayment(double amount) {
        System.out.println("Processing PayPal payment of $" + amount);
    }

    @Override
    public void processUPIPayment(double amount) {
        System.out.println("Processing UPI payment of $" + amount);
    }
}
