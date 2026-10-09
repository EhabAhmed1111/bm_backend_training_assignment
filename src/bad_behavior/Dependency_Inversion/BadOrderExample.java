package bad_behavior.Dependency_Inversion;

import good_behavior.signle_responsibility.Customer;
import good_behavior.signle_responsibility.Payment;

import java.util.Arrays;

public class BadOrderExample {

    static class Order {
        private final String name;
        private final double totalPrice;

        Order(String name, double totalPrice) {
            this.name = name;
            this.totalPrice = totalPrice;
        }

        String getName() { return name; }
        double getTotalPrice() { return totalPrice; }

        void ship() {
            System.out.println("Shipping " + name);
        }
    }

    // this not here
    static class DeliveryOrder extends Order {
        DeliveryOrder(String name, double price) { super(name, price); }

        @Override
        void ship() {
            System.out.println("Delivering " + getName() + " to customer's address");
        }
    }

    // this not here
    static class PickUpOrder extends Order {
        PickUpOrder(String name, double price) { super(name, price); }

        @Override
        void ship() {
            throw new UnsupportedOperationException("Pick-up orders can't be shipped");
        }
    }

    static class OrderManager {

        public void processOrder(Order order) {
            System.out.println("Processing order: " + order.getName() + " now...");
        }

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

        void sendEmailNotification(Customer customer, String message) {
            System.out.println("Sending email notification to: " + customer.getEmail()
                    + " with message: " + message);
        }
    }


}
