package com.geloodev.utils;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
    private static SessionFactory sessionFactory;

    public static void init() {
        try {
            sessionFactory = new Configuration().configure("/com/geloodev/utils/hibernate.cfg.xml").buildSessionFactory();
        } catch (Throwable exception) {
            System.err.println("Failed to initializes Hibernate: " + exception);
            throw new ExceptionInInitializerError(exception);
        }
    }

    public static SessionFactory geSessionFactory() {
        return sessionFactory;
    }
}
