package ua.adeptius.spring.mvc.dao.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import ua.adeptius.spring.mvc.dao.DishDao;
import ua.adeptius.spring.mvc.model.Dish;
import ua.adeptius.spring.mvc.model.Employee;

import java.util.List;

@SuppressWarnings("JpaQlInspection")
public class HDishDao implements DishDao {

    private SessionFactory sessionFactory;

    @Override
    public void save(Dish dish) {
        Session session = sessionFactory.getCurrentSession();
        session.save(dish);
    }

    @Override
    public Dish findByName(String name) {
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("select e from Dish e where e.name like :name");
        query.setParameter("name", name);
        return (Dish) query.uniqueResult();
    }

    @Override
    public List<Dish> findall() {
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("select d from Dish d").list();
    }

    @Override
    public void removeAll() {
        sessionFactory.getCurrentSession().createQuery("delete from Dish").executeUpdate();
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
}
