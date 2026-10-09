package good_behavior.open_close;

import good_behavior.signle_responsibility.Order;

public interface PaymentMethod{
    void startPayment(Order order);
}
