package patterns.observer;

import java.util.List;

public class CallCenterDesktop implements Observer {

    @Override
    public void update(List<Order> orderList) {
       System.out.println("Orders for: " + orderList.toString());
    }
}
