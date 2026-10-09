package good_behavior.dependancy_inversion.payment;

import good_behavior.signle_responsibility.Order;

public interface PaymentMethod{
    void startPayment(Order order);
}
