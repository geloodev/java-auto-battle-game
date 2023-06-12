package com.geloodev.daos;

import static spark.Spark.get;
import java.util.List;
import org.hibernate.Session;
import com.geloodev.models.Player;
import com.geloodev.utils.HibernateUtil;
import com.google.gson.Gson;

public class PlayerDAO extends DAO {

    public void list() {
        get("/players", (request, response) -> {
            Session session = HibernateUtil.geSessionFactory().openSession();
            List<Player> players = session.createQuery("FROM Player", Player.class).list();
            session.close();

            Gson gson = new Gson();
            return gson.toJson(players);
        });
    }
}
