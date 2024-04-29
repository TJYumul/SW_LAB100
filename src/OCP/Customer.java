package OCP;

public class Customer {
    private String name;
    private Discount discount;

    public Customer(String name, Discount discount) {
        this.name = name;
        this.discount = discount;
    }

    public double calculateDiscount(double amount) {
        return discount.calculateDiscount(amount);
    }

    public double applyDiscount(double amount) {
        return amount - calculateDiscount(amount);
    }
}
