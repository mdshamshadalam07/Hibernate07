package com.nit.model;

import java.io.Serializable;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestGetCollection {
	public static void main(String[] args) {
	try {
		// create confi obj
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
			Employee e1 = new Employee();
			
			e1.setEmpId(5);
			e1.setEmpName("Md khan Alam");
			e1.setEmpSal(3.3);
			
			Set<String> s=Set.of("NIT","HTC","MNO");
			e1.setPrjs(s);
			
			Serializable s1=ses.save(e1);
			Integer id=(Integer)s1;
			ses.save(e1);
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