package bad_behavior.interface_segregation;

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
}
