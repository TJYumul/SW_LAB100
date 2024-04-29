package DIP;
import java.util.Map;
public class PaymentProcessor {
    private final Map<String, PaymentMethod> paymentMethods;

    public PaymentProcessor(Map<String, PaymentMethod> paymentMethods) {
        this.paymentMethods = paymentMethods;
    }

    public void processPayment(Order order) {
        String paymentMethod = order.getPaymentMethod();
        PaymentMethod method = paymentMethods.get(paymentMethod);
        if (method != null) {
            method.pay(order.getAmount());
        } else {
            throw new IllegalArgumentException("Unsupported payment method: " + paymentMethod);
        }
    }
}