package good_behavior.signle_responsibility;


public class DeliveryOrder extends Order {
    public DeliveryOrder(String name, double price) { super(name, price); }

    @Override
    public void ship() {
        System.out.println("Delivering " + getName() + " to customer's address");
    }


}
