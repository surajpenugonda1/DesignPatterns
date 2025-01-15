package AdapterPattern;

public class StripeApi {
    public void executePayment(String cardNumber, double amount, String currency) {
        System.out.println("Payment made: " + amount + " " + currency);
    }

    public String retrivePayment(String paymentId) {
        return "Payment with id: " + paymentId + " is successful";
    }
}
