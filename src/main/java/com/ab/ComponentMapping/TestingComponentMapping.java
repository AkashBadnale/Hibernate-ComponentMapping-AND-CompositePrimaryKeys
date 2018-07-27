package com.ab.ComponentMapping;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.ab.utilities.HibernateUtil;

public class TestingComponentMapping {

	public static void main(String[] args) {
		
		Session session = null;
		Transaction tx =  null;
		
		try {
			session = HibernateUtil.getSession();
			tx = session.beginTransaction();
			
			TemporaryAddress  nilyasTempAddress = new TemporaryAddress("satara road","balaji nagar","pune");
			PermanentAddress  nilyasPermanentAddress = new PermanentAddress("sangali road","sangli nagar","sangali");
			Person nilya = new Person(1, "Nilesh", "Kalekar", nilyasTempAddress,nilyasPermanentAddress);
			
			session.save(nilya);
			HibernateUtil.flushNcommit(session, tx);
		}catch (Exception e) {
			tx.rollback();
             e.printStackTrace();
		}finally {
			try {
				if(session!=null) {
					session.close();
				}	
			} catch (Exception e2) {
			     e2.printStackTrace();
			}
		}
	}//main
}//TestingComponentMapping
