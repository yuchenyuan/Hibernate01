package com.ycy.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 * @author YuCy
 * @create 2019-11-21-11:04
 */
public class HibernateUtils {
    private  static SessionFactory sessionFactory;
    private  static  Session session;
    private  static Transaction tx;

    public static Session getSession(){
        return sessionFactory.openSession();
    }


}
