package good_behavior.interface_segregation;

public abstract class OrderPickable extends Order {
    OrderPickable(String name, double totalPrice) {
        super(name, totalPrice);
    }

    public void pickUp() {
        System.out.println("Picking up Order");
    }
}
