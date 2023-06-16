package com.geloodev.utils;

import org.hibernate.Session;
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

    public static void insert(Object object) {
        Session session = HibernateUtil.open();
        try {
            session.beginTransaction();
            session.persist(object);
            session.getTransaction().commit();
        } catch (Exception exception) {
            session.getTransaction().rollback();
            exception.getMessage();
        } 
        session.close();
    }

    public static void update(Object object) {
        Session session = HibernateUtil.open();
        try {
            session.beginTransaction();
            session.merge(object);
            session.getTransaction().commit();
        } catch (Exception exception) {
            session.getTransaction().rollback();
            exception.getMessage();
        } 
        session.close();
    }

    public static void delete(Object object) {
        Session session = HibernateUtil.open();
        try {
            session.beginTransaction();
            session.remove(object);
            session.getTransaction().commit();
        } catch (Exception exception) {
            session.getTransaction().rollback();
            exception.getMessage();
        } 
        session.close();
    }

    public static Session open() {
        return getSessionFactory().openSession();
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}
