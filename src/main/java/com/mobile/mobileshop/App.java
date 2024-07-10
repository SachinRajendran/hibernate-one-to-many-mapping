package com.mobile.mobileshop;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.classic.Session;

import com.mspro.Mobile;


public class App 
{
    public static void main( String[] args )
    {
         AnnotationConfiguration ac = new AnnotationConfiguration();
         ac.configure("./Resource/hibernate.cfg.xml");
         SessionFactory sf = ac.buildSessionFactory();
         Session ss = sf.openSession();
         Transaction trns = ss.beginTransaction();
         
         Query q1 = ss.createQuery("select m from Mobile m");
         List<Mobile> getData = q1.list();
         getData.stream().forEach(temp -> {
        	 System.out.println(temp.getMobileid()+","+temp.getMobilename());
        	 temp.getMobilemodel().stream().forEach(temp1 -> System.out.println(temp1.getModel()+","+temp1.getPrice()));
        	 System.out.println();
         });
         
         trns.commit();
         System.out.println("done");
         
    }
}
