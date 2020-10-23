package patterns.factory;

public class SushiKitchen extends Kitchen {
    @Override
    protected Dish create() {
        return new Sushi();
    }
}
