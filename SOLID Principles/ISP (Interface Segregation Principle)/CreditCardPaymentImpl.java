package isp;

public class CreditCardPaymentImpl implements CreditCardPayment {
    @Override
    public void processCreditCardPayment(double amount) {
        System.out.println("Processing credit card payment of $" + amount);
    }
}
