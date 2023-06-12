package com.geloodev.daos;

import static spark.Spark.get;
import java.util.List;
import org.hibernate.Session;
import com.geloodev.models.Race;
import com.geloodev.utils.HibernateUtil;
import com.google.gson.Gson;

public class RaceDAO {
    
    public RaceDAO() {
        HibernateUtil.init();
    }

    public void list() {
        get("/races", (request, response) -> {
            Session session = HibernateUtil.geSessionFactory().openSession();
            List<Race> races = session.createQuery("FROM Race", Race.class).list();
            session.close();

            Gson gson = new Gson();
            return gson.toJson(races);
        });
    }
}

