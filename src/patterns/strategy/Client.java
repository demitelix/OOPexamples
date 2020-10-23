package patterns.strategy;

public class Client {
    public static void runStrategyPattern(){
        DeliveryService deliveryService = new DeliveryService();
        deliveryService.setDeliveryStrategy(new BikeDelivery());
        deliveryService.deliver();
        deliveryService.setDeliveryStrategy(new CarDelivery());
        deliveryService.deliver();
    }
}
