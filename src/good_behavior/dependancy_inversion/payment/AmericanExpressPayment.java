package good_behavior.dependancy_inversion.payment;

import good_behavior.signle_responsibility.Order;

public class AmericanExpressPayment implements PaymentMethod {
    @Override
    public void startPayment(Order order) {
        System.out.println("Paying with American Express payment...");
        System.out.println("Processing payment of order: " + order.getName());
    }
}
