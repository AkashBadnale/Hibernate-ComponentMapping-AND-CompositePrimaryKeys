package com.ab.compositePrimaryKeys;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.ab.utilities.HibernateUtil;

public class TestingCompositePrimaryKeys {

	public static void main(String[] args) {

		Session session = null;
		Transaction tx = null;

		try {
			session = HibernateUtil.getSession();
			tx = session.beginTransaction();

			Citizen citizen = new Citizen(1234567887, 785632145, "Tom", "Holland");
			session.save(citizen);
			HibernateUtil.flushNcommit(session, tx);
		} catch (Exception e) {
			tx.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
	}// main
}// TestingCompositePrimaryKeys
