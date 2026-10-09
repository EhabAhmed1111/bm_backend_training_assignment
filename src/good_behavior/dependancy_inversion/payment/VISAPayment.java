package good_behavior.dependancy_inversion.payment;

import good_behavior.signle_responsibility.Order;

public class VISAPayment implements PaymentMethod {


    @Override
    public void startPayment(Order order) {
        System.out.println("Paying with VISA payment...");
        System.out.println("Processing payment of order: " + order.getName());
    }
}
