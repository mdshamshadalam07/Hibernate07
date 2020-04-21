package com.nit.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestClass {
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
		Student1 s1=new Student1();
		s1.setStdId(9);
		s1.setStdName("Md Sunny Alam");
		s1.setStdFee(36.6);
		List<Double>marks=new ArrayList<Double>();
		marks.add(80.0);
		marks.add(90.0);
		marks.add(92.0);
		s1.setMarks(marks);
		
		Serializable s=ses.save(s1);
		Integer id=(Integer)s;
		ses.save(s1);
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