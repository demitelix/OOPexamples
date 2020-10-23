package patterns.abstract_factory;

public class AsiaKitchen extends Kitchen {
    @Override
    protected Drinks createDrink() {
        return new Tea();
    }

    @Override
    protected Food createFood() {
        return new Sushi();
    }
}
