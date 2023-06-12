package pt.javarush.dao;

import org.hibernate.SessionFactory;
import pt.javarush.entity.Staff;

public class StaffDAO extends GenericDAO<Staff> {
    public StaffDAO(SessionFactory sessionFactory) {
        super(Staff.class, sessionFactory);
    }
}
