package good_behavior.signle_responsibility;

public class Payment {
    private final String type;

    public Payment(String type) { this.type = type; }

    public String getType() { return type; }
}
