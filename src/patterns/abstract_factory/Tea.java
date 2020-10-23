package patterns.abstract_factory;

public class Tea implements Drinks {

    @Override
    public void prepare() {
        System.out.println("Tea is Ready");
    }
}
