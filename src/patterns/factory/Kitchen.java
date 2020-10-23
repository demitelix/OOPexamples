package patterns.factory;

public abstract class Kitchen {
    void makeByRecept(){
        Dish dish = create();
        dish.makeAccordingRecipe();
    }

    protected abstract Dish create();
}
