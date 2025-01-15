package AdapterPattern;

public class PaypalApi {
    public void makePayment(String paypalEmail, double amount) {
        System.out.println("Payment made: " + amount);
    }

    public String checkPayment(String paymentId) {
        return "Payment with id: " + paymentId + " is successful";
    }
}
