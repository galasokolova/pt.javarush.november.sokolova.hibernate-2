package pt.javarush.dao;

import org.hibernate.SessionFactory;
import pt.javarush.entity.Rating;

public class RatingDAO extends GenericDAO<Rating> {
    public RatingDAO(SessionFactory sessionFactory) {
        super(Rating.class, sessionFactory);
    }
}
