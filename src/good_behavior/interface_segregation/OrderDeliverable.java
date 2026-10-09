package good_behavior.interface_segregation;

public abstract class OrderDeliverable extends Order {

    OrderDeliverable(String name, double totalPrice) {
       super(name,  totalPrice);
    }

    void ship() {
        System.out.println("Shipping " + getName());
    }
}
