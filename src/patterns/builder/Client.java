package patterns.builder;

public class Client {
    public static void runBuilderPattern() {
        Director director = new Director();
        CarBuilder builder = new CarBuilder();
        director.makeJepp(builder);
        Car jeep = builder.getCar();
        System.out.println(jeep.toString());
        director.makeCabrio(builder);
        Car cabrio = builder.getCar();
        System.out.println(cabrio.toString());
    }
}
