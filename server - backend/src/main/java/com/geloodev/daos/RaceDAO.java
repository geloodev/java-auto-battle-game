package com.geloodev.daos;

import java.util.List;
import java.util.UUID;
import org.hibernate.Session;
import com.geloodev.models.Race;
import com.geloodev.utils.HibernateUtil;

public class RaceDAO extends DAO<Race> {

    public List<Race> selectAll() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        List<Race> races = session.createQuery("FROM Race", Race.class).list();
        session.close();
        return races;
    }

    public Race selectById(UUID id) {
        Session session = HibernateUtil.open();
        Race race = session.createQuery("FROM Race WHERE id = :id", Race.class)
            .setParameter("id", id)
            .uniqueResult();
        session.close();
        return race;
    }

    public Race selectByName(String name) {
        Session session = HibernateUtil.open();
        Race race = session.createQuery("FROM Race WHERE name = :name", Race.class)
            .setParameter("name", name)
            .uniqueResult();
        session.close();
        return race;
    }

    public void insert(Race race) {
        HibernateUtil.insert(race);
    }

    public void update(Race race) {
        HibernateUtil.update(race);
    }

    public void delete(Race race) {
        HibernateUtil.delete(race);
    }
}

