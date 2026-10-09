package good_behavior.open_close;

import good_behavior.signle_responsibility.Customer;
import good_behavior.signle_responsibility.Order;

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
    public void processPayment(Order order, PaymentMethod payment) {
        System.out.println("Processing payment of order: " + order.getName());
        System.out.println("Issuing payment for amount: " + order.getTotalPrice());
        payment.startPayment(order);

    }

    public void sendEmailNotification(Customer customer, String message) {
        System.out.println("Sending email notification to: " + customer.getEmail()
                + " with message: " + message);
    }
}
