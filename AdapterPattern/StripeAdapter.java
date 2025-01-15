package AdapterPattern;

public class StripeAdapter implements PaymentProcessor {
    private StripeApi stripe;
    private String cardNumber;
    private String currency;

    public StripeAdapter(String cardNumber, String currency) {
        this.stripe = new StripeApi();
        this.cardNumber = cardNumber;
        this.currency = currency;
    }

    @Override
    public void processPayment(double amount) {
        stripe.executePayment(cardNumber, amount, currency);
    }

    @Override
    public String getPaymentStatus(String paymentId) {
        return stripe.retrivePayment(paymentId);
    }
}