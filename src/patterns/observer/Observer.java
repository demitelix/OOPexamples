package patterns.observer;

import java.util.List;

public interface Observer {
    void update(List<Order>orderList);
}
