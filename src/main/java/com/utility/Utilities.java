package com.utility;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Utilities {

    public static SessionFactory createConnection() {
            SessionFactory sessionFactory = null;
        try {
            Configuration configuration = new Configuration();

            configuration.configure("hibernate.cfg.xml");
             sessionFactory = configuration.buildSessionFactory();

        }catch (Exception e){
            e.printStackTrace();
        }
        return sessionFactory;
    }
}
