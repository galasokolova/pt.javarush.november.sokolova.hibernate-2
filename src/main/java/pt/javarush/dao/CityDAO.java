package pt.javarush.dao;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import pt.javarush.entity.City;

public class CityDAO extends GenericDAO<City> {
    public CityDAO(SessionFactory sessionFactory) {
        super(City.class, sessionFactory);
    }

    public City getByName(String cityName){
        Query<City> query = getCurrentSession().createQuery("select c from City c where c.city = :NAME", City.class);
        query.setParameter("NAME", cityName);
        query.setMaxResults(1);
        return query.getSingleResult();
    }
}
