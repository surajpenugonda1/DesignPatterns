package AdapterPattern;

public class PaymentService {
    private PaymentProcessor paymentProcessor;

    public PaymentService(PaymentProcessor paymentProcessor) {
        this.paymentProcessor = paymentProcessor;
    }   

    public void makePayment(double amount) {
        paymentProcessor.processPayment(amount);
    }

    public String checkPaymentStatus(String paymentId) {
        return paymentProcessor.getPaymentStatus(paymentId);
    }
    
}