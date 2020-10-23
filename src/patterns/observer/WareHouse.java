package patterns.observer;

import java.util.ArrayList;
import java.util.List;

public class WareHouse implements ObservableSubject {
    private List<Observer>observers = new ArrayList<>();
    private List<Order>orderList = new ArrayList<>();


    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(Observer it:observers){
            it.update(orderList);
        }
    }

    public void orderCameIn(Order order){
        orderList.add(order);
        notifyObservers();
    }

    public List<Order> getOrderList() {
        return orderList;
    }


}



