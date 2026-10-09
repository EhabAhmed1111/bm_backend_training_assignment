package good_behavior.open_close;

import good_behavior.signle_responsibility.Customer;
import good_behavior.signle_responsibility.Order;

public class UserManagement {

    private final OrderManager orderManager = new OrderManager();

    public void placeOrder(Customer customer, Order order, PaymentMethod payment) {
        orderManager.processOrder(order);
        orderManager.processPayment(order, payment);
        orderManager.sendEmailNotification(customer, "Order " + order.getName() + " confirmed");
    }
}

