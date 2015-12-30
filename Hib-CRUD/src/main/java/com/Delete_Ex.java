package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.model.Product;

/*
 *  in 4 ways , we can select with hibernate
 *  
 *  --> by primary key
 *  --> HQL
 *  --> Criteria API
 *  --> Native SQL
 * 
 */

public class Delete_Ex {

	public static void main(String[] args) {

		//
		// use Hinernate API

		// --------------------------------------------------
		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory sessionFactory = null;
		sessionFactory = cfg.buildSessionFactory();
		// --------------------------------------------------

		Session session = sessionFactory.openSession();
		session.getTransaction().begin();

		// do your work...

		Product product = (Product) session.get(Product.class, 5345); // persistent
																		// state
		session.delete(product); // Removed state

		session.getTransaction().commit(); // Transient State
		session.close();
		sessionFactory.close();

	}

}
