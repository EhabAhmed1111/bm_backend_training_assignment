package good_behavior.dependancy_inversion.order;


public class PickUpOrder extends OrderPickable {
    PickUpOrder(String name, double price) { super(name, price); }


    @Override
    public void pickUp() {
        System.out.println("pickUp " + getName() );
    }
}
