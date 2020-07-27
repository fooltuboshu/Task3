package com.hibernate.com.lisst;

import java.util.HashMap;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

public class App 
{
    public static void main( String[] args )
    {
    	System.out.println("hello world");
    	Configuration cfg = new Configuration();
    	cfg.configure("Emp-Config.xml");
    	System.out.println("Configuration Object Created Successfully");
    	SessionFactory sf = cfg.buildSessionFactory();
    	System.out.println("Session Factory Object Created Successfully");
    	Session s = sf.openSession();
    	Transaction t = s.beginTransaction();
    	Emp e = new Emp();
    	String id = "101";
    	e.setId("101");
    	e.setName("Lala");
//    	Address p1 = new Address();
//    	p1.setAid("101");
//    	p1.setStreet("Avalon street");
//    	p1.setZipcode("32513");
//       	Address p2 = new Address();
//    	p2.setAid("102");
//    	p2.setStreet("Dada street");
//    	p2.setZipcode("93932");  
    	e.setAddress(new HashMap<String, Address>());
    	e.getAddress().put(id, new Address(id, "lala street", "38822"));
    	e.getAddress().put(id, new Address(id, "dada street", "38811"));
    	s.save(e);
    	t.commit();
    	System.out.println("Successfully inserted into Database");
    	s.close();
    	sf.close();
    }
}
