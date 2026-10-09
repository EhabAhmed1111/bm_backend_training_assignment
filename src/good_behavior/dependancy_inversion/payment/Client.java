package good_behavior.dependancy_inversion.payment;

import good_behavior.signle_responsibility.*;

import java.util.List;

public class Client {
    public static void main(String[] args) {

        // this user registration
        Customer customer = new Customer("Sara", "sara@example.com");

        // user's order object(cart)
        Order order = new DeliveryOrder("Laptop", 1200.0);

        new UserManagement().placeOrder(customer, order, new VISAPayment());

        try {
            new OrderManager().processPayment(order, new AmericanExpressPayment());
        } catch (UnsupportedOperationException e) {
            System.out.println("Payment failed: " + e.getMessage());
        }

        try {
            OrderManager.shipAll(List.of(new DeliveryOrder("Phone", 800.0), new PickUpOrder("Book", 20.0)));
        } catch (UnsupportedOperationException e) {
            System.out.println("Shipping failed: " + e.getMessage());
        }

        try {
            new Subscriber().login("Omar");
        } catch (UnsupportedOperationException e) {
            System.out.println("Login failed: " + e.getMessage());
        }
    }
}
