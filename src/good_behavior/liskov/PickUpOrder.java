package good_behavior.liskov;


public class PickUpOrder extends Order{
    PickUpOrder(String name, double price) { super(name, price); }


    // You don't need it then don't override it
//    @Override
//    void ship() {
//        throw new UnsupportedOperationException("Pick-up orders can't be shipped");
//    }
}
