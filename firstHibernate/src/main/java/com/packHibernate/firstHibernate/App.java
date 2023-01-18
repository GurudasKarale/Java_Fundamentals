package com.packHibernate.firstHibernate;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
//import org.hibernate.service.ServiceRegistry;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	Powers ps = new Powers();
    	ps.setPid(101);
    	ps.setPname("recon");
    	
    	Agent ag = new Agent();
    	ag.setAid(1);
    	ag.setName("SOVA");
    	ag.setStrength(90);
    	ag.getPower().add(ps);
        //DataSave ds = new DataSave();
        
        /*ds.setAid(102);
        ds.setAname("Omen");
        ds.setColor("Grey");*/
        
        Configuration con = new Configuration().configure().addAnnotatedClass(Agent.class).addAnnotatedClass(Powers.class);
        SessionFactory sf = con.buildSessionFactory();
        
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();
        //ds = (DataSave)session.get(DataSave.class, 101); //fetches the data from table
        //session.save(ds); //saves the data in table
        session.save(ps);
        session.save(ag);
        tx.commit();
        //System.out.println(ds);
    }
}
