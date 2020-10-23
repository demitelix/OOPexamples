package patterns.builder;

public class Car {
    int seats;
    int doors;
    String engine;
    boolean cabrio;

    public boolean isCabrio() {
        return cabrio;
    }

    public void setCabrio(boolean cabrio) {
        this.cabrio = cabrio;
    }

    @Override
    public String toString() {
        return  "engine: "+engine+"\nseats: "+seats+"\ndoors: " + doors + "\ncabrio: " + (cabrio?"yes" : "no");
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }
}
