package pt.javarush.dao;

import org.hibernate.SessionFactory;
import pt.javarush.entity.Actor;

public class ActorDAO extends GenericDAO<Actor> {
    public ActorDAO(SessionFactory sessionFactory) {

        super(Actor.class, sessionFactory);
    }
}
