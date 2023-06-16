package com.geloodev.daos;

import java.util.List;
import java.util.UUID;

import org.hibernate.Session;

import com.geloodev.models.Weapon;
import com.geloodev.utils.HibernateUtil;

public class WeaponDAO extends DAO<Weapon> {

    public List<Weapon> selectAll() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        List<Weapon> weapons = session.createQuery("FROM Weapon", Weapon.class).list();
        session.close();
        return weapons;
    }

    public Weapon selectById(UUID id) {
        Session session = HibernateUtil.open();
        Weapon weapon = session.createQuery("FROM Weapon WHERE id = :id", Weapon.class)
            .setParameter("id", id)
            .uniqueResult();
        session.close();
        return weapon;
    }

    public Weapon selectByName(String name) {
        Session session = HibernateUtil.open();
        Weapon weapon = session.createQuery("FROM Weapon WHERE name = :name", Weapon.class)
            .setParameter("name", name)
            .uniqueResult();
        session.close();
        return weapon;
    }

    public void insert(Weapon player) {
        HibernateUtil.insert(player);
    }

    public void update(Weapon weapon) {
        HibernateUtil.update(weapon);
    }

    public void delete(Weapon weapon) {
        HibernateUtil.delete(weapon);
    }
}

