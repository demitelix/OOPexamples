package patterns.strategy;

public class CarDelivery implements DeliveryStrategy {
    @Override
    public void deliver() {
        System.out.println("car delivery");
    }
}
