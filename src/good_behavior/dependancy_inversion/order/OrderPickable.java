package good_behavior.dependancy_inversion.order;

public abstract class OrderPickable extends Order {
    OrderPickable(String name, double totalPrice) {
        super(name, totalPrice);
    }

    public void pickUp() {
        System.out.println("Picking up Order");
    }
}
