package pt.javarush.dao;

import org.hibernate.SessionFactory;
import pt.javarush.entity.FilmText;

public class FilmTextDAO extends GenericDAO<FilmText> {
    public FilmTextDAO(SessionFactory sessionFactory) {
        super(FilmText.class, sessionFactory);
    }
}
