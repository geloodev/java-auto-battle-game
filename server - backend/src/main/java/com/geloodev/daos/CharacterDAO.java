package com.geloodev.daos;

import java.util.List;
import java.util.UUID;
import org.hibernate.Session;
import com.geloodev.models.Character;
import com.geloodev.utils.HibernateUtil;

public class CharacterDAO extends DAO<Character> {
    
    public List<Character> selectAll() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        List<Character> character = session.createQuery("FROM Character", Character.class).list();
        session.close();
        return character;
    }

    public Character selectById(UUID id) {
        Session session = HibernateUtil.open();
        Character character = session.createQuery("FROM Character WHERE id = :id", Character.class)
            .setParameter("id", id)
            .uniqueResult();
        session.close();
        return character;
    }

    public Character selectByName(String name) {
        Session session = HibernateUtil.open();
        Character character = session.createQuery("FROM Character WHERE name = :name", Character.class)
            .setParameter("name", name)
            .uniqueResult();
        session.close();
        return character;
    }

    public void insert(Character character) {
        HibernateUtil.insert(character);
    }

    public void update(Character character) {
        HibernateUtil.update(character);
    }

    public void delete(Character character) {
        HibernateUtil.delete(character);
    }
}
