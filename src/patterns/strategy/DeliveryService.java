package patterns.strategy;

public class DeliveryService {
    private DeliveryStrategy deliveryStrategy;

    public DeliveryService() {
    }

    public void setDeliveryStrategy(DeliveryStrategy deliveryStrategy) {
        this.deliveryStrategy = deliveryStrategy;
    }
    public void deliver(){
        deliveryStrategy.deliver();
    }
}
