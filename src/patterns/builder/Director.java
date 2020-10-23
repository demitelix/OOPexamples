package patterns.builder;

public class Director {

    public void makeJepp(Builder builder){
        builder.setDoorsCount(4);
        builder.setEngineName("V8 - 5.0");
        builder.setSeatCount(5);
    }
    public void makeCabrio(Builder builder){
        builder.setSeatCount(2);
        builder.setDoorsCount(2);
        builder.makeCabrio(true);
        builder.setEngineName("V6 - 2.8");
    }
}
