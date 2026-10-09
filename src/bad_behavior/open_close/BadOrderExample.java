package bad_behavior.open_close;

import good_behavior.signle_responsibility.Order;
import good_behavior.signle_responsibility.Payment;

public class BadOrderExample {

    public void processPayment(Order order, Payment payment) {
        System.out.println("Processing payment of order: " + order.getName());
        System.out.println("Issuing payment for amount: " + order.getTotalPrice());
        if (payment.getType().equalsIgnoreCase("VISA")) {
            System.out.println("Processing visa card payments...");
        } else if (payment.getType().equalsIgnoreCase("MASTER_CARD")) {
            System.out.println("Processing master card payments...");
        } else if (payment.getType().equalsIgnoreCase("AMERICAN_EXPRESS")) {
            System.out.println("Processing american express card payments...");
        } else {
            throw new UnsupportedOperationException("Un supported payment...");
        }
    }
}
