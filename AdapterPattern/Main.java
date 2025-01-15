package AdapterPattern;


// Objects with incompatible interfaces colloborate with each other
public class Main {
    public static void main(String[] args) {
        PaymentProcessor paypalProcessor = new PaypalAdapter("user@example.com");
        PaymentService paypalPayment = new PaymentService(paypalProcessor);
        paypalPayment.makePayment(100.00);
        System.out.println(paypalPayment.checkPaymentStatus("PAY123"));

        System.out.println("\n-------------------\n");

        // Process payment using Stripe
        PaymentProcessor stripeProcessor = new StripeAdapter("4111111111111111", "USD");
        PaymentService stripePayment = new PaymentService(stripeProcessor);
        stripePayment.makePayment(50.00);
        System.out.println(stripePayment.checkPaymentStatus("STR456"));
    }
}