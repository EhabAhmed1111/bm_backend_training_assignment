package good_behavior.dependancy_inversion.order;

public class DeliveryOrder extends OrderDeliverable {
    DeliveryOrder(String name, double price) { super(name, price); }

    @Override
    void ship() {
        System.out.println("Delivering " + getName() + " to customer's address");
    }
}
