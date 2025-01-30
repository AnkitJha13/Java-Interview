package dip;

public class PaymentProcessor {
    private final Payment payment;

    // Constructor Dependency Injection (DI)
    public PaymentProcessor(Payment payment) {
        this.payment = payment;
    }

    public void makePayment(double amount) {
        this.payment.processPayment(amount);
    }
}
