package patterns.strategy;

public class BikeDelivery implements DeliveryStrategy {
    @Override
    public void deliver() {
        System.out.println("Bike delivery");
    }
}
