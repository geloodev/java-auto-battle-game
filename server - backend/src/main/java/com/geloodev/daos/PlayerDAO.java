package com.geloodev.daos;

import java.util.List;
import java.util.UUID;

import org.hibernate.Session;
import com.geloodev.models.Player;
import com.geloodev.utils.HibernateUtil;

public class PlayerDAO extends DAO<Player> {

    public List<Player> selectAll() {
        Session session = HibernateUtil.open();
        List<Player> players = session.createQuery("FROM Player", Player.class).list();
        session.close();
        return players;
    }

    public Player selectById(UUID id) {
        Session session = HibernateUtil.open();
        Player player = session.createQuery("FROM Player WHERE id = :id", Player.class)
            .setParameter("id", id)
            .uniqueResult();
        session.close();
        return player;
    }

    public Player selectByName(String name) {
        Session session = HibernateUtil.open();
        Player player = session.createQuery("FROM Player WHERE name = :name", Player.class)
            .setParameter("name", name)
            .uniqueResult();
        session.close();
        return player;
    }

    public void insert(Player player) {
        HibernateUtil.insert(player);
    }

    public void update(Player player) {
        HibernateUtil.update(player);
    }

    public void delete(Player player) {
        HibernateUtil.delete(player);
    }
}
