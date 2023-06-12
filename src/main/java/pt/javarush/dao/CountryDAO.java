package pt.javarush.dao;

import org.hibernate.SessionFactory;
import pt.javarush.entity.Country;

public class CountryDAO extends GenericDAO<Country> {
    public CountryDAO(SessionFactory sessionFactory) {
        super(Country.class, sessionFactory);
    }
}
