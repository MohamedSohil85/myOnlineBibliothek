/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import org.hibernate.Session;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.SessionFactory;

/**
 * Hibernate Utility class with a convenient method to get Session Factory
 * object.
 *
 *
 */
public class NewHibernateUtil {

    private static  SessionFactory sessionFactory;
    private static Session session; //NULL

    static {
        try {
            // Create the SessionFactory from standard (hibernate.cfg.xml) 
            // config file.
            sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
        } catch (Throwable ex) {
            // Log the exception. 
            System.err.println("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public static Session getSession() {
        if (session != null && !session.isOpen()) {
            setSession(null);
        }
        if (session == null) { // singleton (si se cerrara la session hacemos nulo a este objeto y abrimos una nueva
            session = getSessionFactory().openSession(); //siempre abrimos una nueva sesion
        }
        return session;
    }

    public static void setSession(Session session) {
        NewHibernateUtil.session = session;
    }
}
