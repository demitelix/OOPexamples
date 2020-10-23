package patterns.factory;

public class Client {
    private static Kitchen kitchen;
    public static void runFactoryPattern() {
        kitchen = new PizzaKitchen();
        kitchen.makeByRecept();
        kitchen = new SushiKitchen();
        kitchen.makeByRecept();
        kitchen = new DesertKitchen();
        kitchen.makeByRecept();
    }
}
