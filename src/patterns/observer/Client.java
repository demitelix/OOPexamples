package patterns.observer;

public class Client {
    public static void runObserverPattern() {
        WareHouse deliveryCenter = new WareHouse();
        Observer operator = new CallCenterDesktop();
        deliveryCenter.addObserver(operator);
        deliveryCenter.addObserver(new MobileNotifier());
        deliveryCenter.orderCameIn(new Order(12.9,"Valdis"));
        deliveryCenter.orderCameIn(new Order(22.3,"Andris"));
        deliveryCenter.orderCameIn(new Order(10.0,"Janis"));

        deliveryCenter.removeObserver(operator);
        deliveryCenter.orderCameIn(new Order(14.2,"Vitolds"));
        deliveryCenter.orderCameIn(new Order(15.9,"Anna"));
    }
}
