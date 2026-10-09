package good_behavior.signle_responsibility;

public class Customer {
    // credentials
    private final String name;
    private final String email;

    public Customer(String name, String email) {
        this.name = name;
        this.email = email;
    }

    String getName() { return name; }
    public String getEmail() { return email; }
}
