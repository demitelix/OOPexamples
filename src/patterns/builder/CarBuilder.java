package patterns.builder;

public class CarBuilder implements Builder {
    private Car car = new Car();
    @Override
    public void setSeatCount(int i) {
        this.car.setSeats(i);
    }

    @Override
    public void setEngineName(String name) {
        this.car.setEngine(name);
    }

    @Override
    public void setDoorsCount(int i) {
        this.car.setDoors(i);
    }

    @Override
    public void makeCabrio(boolean i) {
        this.car.setCabrio(i);
    }

    public Car getCar(){
        return car;
    }
}
