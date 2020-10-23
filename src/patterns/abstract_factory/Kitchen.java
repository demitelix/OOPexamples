package patterns.abstract_factory;

public abstract class Kitchen {
    public void makeDishComplect(){
        Food food = createFood();
        Drinks drink = createDrink();
        food.cook();
        drink.prepare();
    }

    protected abstract Drinks createDrink();
    protected abstract Food createFood();
}
