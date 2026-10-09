package good_behavior.dependancy_inversion.order;

public abstract class Order {
    private final String name;
    private final double totalPrice;

    Order(String name, double totalPrice) {
        this.name = name;
        this.totalPrice = totalPrice;
    }

    String getName() { return name; }
    double getTotalPrice() { return totalPrice; }
}
