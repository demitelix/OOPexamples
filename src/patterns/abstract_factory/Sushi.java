package patterns.abstract_factory;

public class Sushi implements Food {
    @Override
    public void cook() {
        System.out.println("Sushi ready");
    }
}
