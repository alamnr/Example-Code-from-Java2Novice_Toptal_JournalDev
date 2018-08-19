package com.telesko.DemoHib;





import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.internal.SessionFactoryServiceRegistryBuilderImpl;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Alien telusko  = new Alien();
        //telusko.setAid(101);
        telusko.setAname("Navin");
        telusko.setColor("Green");
        
        Configuration cfg = new Configuration().configure().addAnnotatedClass(Alien.class); // in case of default name , no need to mention 
        
        ServiceRegistry reg =  new StandardServiceRegistryBuilder().applySettings(cfg.getProperties()).build();
        SessionFactory sf = cfg.buildSessionFactory(reg);
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();
        session.save(telusko);
        tx.commit();
        
    }
}
