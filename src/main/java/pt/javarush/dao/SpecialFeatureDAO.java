package pt.javarush.dao;

import org.hibernate.SessionFactory;
import pt.javarush.entity.SpecialFeature;

public class SpecialFeatureDAO extends GenericDAO<SpecialFeature> {
    public SpecialFeatureDAO(SessionFactory sessionFactory) {
        super(SpecialFeature.class, sessionFactory);
    }
}
