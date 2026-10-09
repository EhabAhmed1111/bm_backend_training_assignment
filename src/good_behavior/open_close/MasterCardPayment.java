package good_behavior.open_close;

import good_behavior.signle_responsibility.Order;

public class MasterCardPayment implements PaymentMethod{
    @Override
    public void startPayment(Order order) {
        System.out.println("Paying with master card payment...");
        System.out.println("Processing payment of order: " + order.getName());
    }
}
