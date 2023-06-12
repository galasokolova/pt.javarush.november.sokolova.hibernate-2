package pt.javarush.dao;

import org.hibernate.SessionFactory;
import pt.javarush.entity.Language;

public class LanguageDAO extends GenericDAO<Language> {
    public LanguageDAO(SessionFactory sessionFactory) {
        super(Language.class, sessionFactory);
    }
}
