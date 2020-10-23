package patterns.factory;

public class Pizza implements Dish {
    @Override
    public void makeAccordingRecipe() {
        System.out.println("Here is BBQ");
    }
}
