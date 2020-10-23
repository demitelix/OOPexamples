package patterns.factory;

public class PizzaKitchen extends Kitchen {
    @Override
    protected Dish create() {
        return new Pizza();
    }
}
