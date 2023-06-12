package pt.javarush.dao;

import org.hibernate.SessionFactory;
import pt.javarush.entity.Inventory;

public class InventoryDAO extends GenericDAO<Inventory> {
    public InventoryDAO(SessionFactory sessionFactory) {
        super(Inventory.class, sessionFactory);
    }
}
