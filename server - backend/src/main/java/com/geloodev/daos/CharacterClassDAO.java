package com.geloodev.daos;

import java.util.List;
import java.util.UUID;
import org.hibernate.Session;
import com.geloodev.models.CharacterClass;
import com.geloodev.utils.HibernateUtil;

public class CharacterClassDAO extends DAO<CharacterClass> {
    
    public List<CharacterClass> selectAll() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        List<CharacterClass> characterClass = session.createQuery("FROM CharacterClass", CharacterClass.class).list();
        session.close();
        return characterClass;
    }

    public CharacterClass selectById(UUID id) {
        Session session = HibernateUtil.open();
        CharacterClass characterClass = session.createQuery("FROM CharacterClass WHERE id = :id", CharacterClass.class)
            .setParameter("id", id)
            .uniqueResult();
        session.close();
        return characterClass;
    }

    public CharacterClass selectByName(String name) {
        Session session = HibernateUtil.open();
        CharacterClass characterClass = session.createQuery("FROM CharacterClass WHERE name = :name", CharacterClass.class)
            .setParameter("name", name)
            .uniqueResult();
        session.close();
        return characterClass;
    }

    public void insert(CharacterClass characterClass) {
        HibernateUtil.insert(characterClass);
    }

    public void update(CharacterClass characterClass) {
        HibernateUtil.update(characterClass);
    }

    public void delete(CharacterClass characterClass) {
        HibernateUtil.delete(characterClass);
    }
}
