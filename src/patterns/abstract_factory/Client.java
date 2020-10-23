package patterns.abstract_factory;




public class Client {
    private static Kitchen kitchen;
    public static void runAbstractPattern() {
        kitchen = new AsiaKitchen();
        kitchen.makeDishComplect();
    }
}
