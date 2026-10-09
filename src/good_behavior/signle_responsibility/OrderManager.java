package good_behavior.signle_responsibility;


import java.util.List;

public class OrderManager {
    public void processOrder(Order order) {
        System.out.println("Processing order: " + order.getName() + " now...");
    }


    // this class should be responsible to ship the order after he finishes
    // he will call the delivery to start this operation
    public static void shipAll(List<Order> orders) {
        for (Order order : orders) {
            order.ship();
        }
    }

    // O/C
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

    public void sendEmailNotification(Customer customer, String message) {
        System.out.println("Sending email notification to: " + customer.getEmail()
                + " with message: " + message);
    }
}
