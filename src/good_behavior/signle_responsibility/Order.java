package good_behavior.signle_responsibility;

public class Order {
    private final String name;
    private final double totalPrice;

    Order(String name, double totalPrice) {
        this.name = name;
        this.totalPrice = totalPrice;
    }

    public String getName() { return name; }
    public double getTotalPrice() { return totalPrice; }

    public void ship() {
        System.out.println("Shipping " + name);
    }
}
