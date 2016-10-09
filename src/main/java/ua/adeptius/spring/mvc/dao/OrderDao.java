package ua.adeptius.spring.mvc.dao;


import ua.adeptius.spring.mvc.model.Order;

import java.util.List;

public interface OrderDao {

    void save(Order order);

    List<Order> findAllOrders();

    void removeAll();

}
