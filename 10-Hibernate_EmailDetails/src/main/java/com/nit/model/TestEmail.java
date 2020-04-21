package com.nit.model;

import java.io.Serializable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;




public class TestEmail {

	public static void main(String[] args) {

		try {

			//1. create config obj
			Configuration cfg=new Configuration();

			//2. load cfg.xml
			cfg.configure();

			//3. build ses fact
			SessionFactory sf=cfg.buildSessionFactory();

			//4. open one session
			Session ses=sf.openSession();

			//5. begin Tx
			Transaction tx=ses.beginTransaction();

			//6. perform save operation
			Email e=new Email();
			e.setEid(103);
			e.setEto("Shams@gmailcom");
			e.setEfrom("Babu@");
			e.seteText("ABC");
			e.setEsub("hyd");

			Serializable s=ses.save(e);
			Integer id=(Integer)s;
			//7. commit
			tx.commit();
			//8.close ses
			ses.close();

			System.out.println("Done:"+id);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}


