package pt.javarush.dao;

import org.hibernate.SessionFactory;
import pt.javarush.entity.Customer;

public class CustomerDAO extends GenericDAO<Customer> {
    public CustomerDAO(SessionFactory sessionFactory) {
        super(Customer.class, sessionFactory);
    }
}
