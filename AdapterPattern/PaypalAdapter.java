package AdapterPattern;

public class PaypalAdapter implements PaymentProcessor {
    private PaypalApi paypalApi;
    private String paypalEmail;

    public PaypalAdapter(String paypalEmail) {
        this.paypalApi = new PaypalApi();
        this.paypalEmail = paypalEmail;
    }

    @Override
    public void processPayment(double amount) {
        paypalApi.makePayment(paypalEmail, amount);
    }

    @Override
    public String getPaymentStatus(String paymentId) {
        return paypalApi.checkPayment(paymentId);
    }
    
}
