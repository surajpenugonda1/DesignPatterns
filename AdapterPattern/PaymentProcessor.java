package AdapterPattern;

public interface PaymentProcessor {
    void processPayment(double amount);
    String getPaymentStatus(String paymentId);
}
