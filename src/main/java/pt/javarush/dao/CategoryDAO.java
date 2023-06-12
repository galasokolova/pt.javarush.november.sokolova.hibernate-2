package pt.javarush.dao;

import org.hibernate.SessionFactory;
import pt.javarush.entity.Category;

public class CategoryDAO extends GenericDAO<Category> {
    public CategoryDAO(SessionFactory sessionFactory) {
        super(Category.class, sessionFactory);
    }
}
