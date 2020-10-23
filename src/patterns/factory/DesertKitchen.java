package patterns.factory;

public class DesertKitchen extends Kitchen {
    @Override
    protected Dish create() {
        return new Desert();
    }
}
