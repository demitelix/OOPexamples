package patterns.observer;

import java.util.List;

public class MobileNotifier implements Observer {
    @Override
    public void update(List<Order> orderList) {
        System.out.println(getClass().getSimpleName()+": " + orderList.toString());
    }
}
