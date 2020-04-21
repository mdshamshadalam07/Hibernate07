package com.nit.model;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestProduct {
	private static final String Id = null;

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
				ProductAllList pro1=new ProductAllList();
				pro1.setProdId(101);
				pro1.setProdCode("Pen");
				pro1.setProdCost(4.5);
				ses.save(pro1);
				
				ProductAllList pro2=new ProductAllList();
				pro2.setProdId(102);
				pro2.setProdCode("Book");
				pro2.setProdCost(7.5);
				ses.save(pro2);
				
				ProductAllList pro3=new ProductAllList();
				pro3.setProdId(103);
				pro3.setProdCode("Pencile");
				pro3.setProdCost(8.5);
				ses.save(pro3);		
		        //7. commit
				tx.commit();
				//8.close ses
				ses.close();
				
				System.out.println("Done:"+Id);
		   	}
				catch(Exception e) {
					e.printStackTrace();
				}
          }
}