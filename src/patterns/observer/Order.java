package patterns.observer;

public class Order {
    private double value;
    private String customerName;

    @Override
    public String toString() {
        return "Order for: " + customerName + " - "+ value;
    }

    public Order(double value, String customerName) {
        this.value = value;
        this.customerName = customerName;
    }

    public double getValue() {
        return value;
    }

    public String getCustomerName() {
        return customerName;
    }
}
