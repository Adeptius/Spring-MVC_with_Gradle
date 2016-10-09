package ua.adeptius.spring.mvc.dao;


import ua.adeptius.jdbc.model.Dish;

import java.util.List;

public interface DishDao {

    void save(Dish dish);

    List<Dish> findall();

    Dish findByName(String name);

    void removeAll();
}
