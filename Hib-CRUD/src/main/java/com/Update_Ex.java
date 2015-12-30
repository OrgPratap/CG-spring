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

public class Update_Ex {

	public static void main(String[] args) {

		//
		// use Hinernate API

		// --------------------------------------------------
		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory sessionFactory = null;
		sessionFactory = cfg.buildSessionFactory();
		// --------------------------------------------------

		// Req-1
		Session session = sessionFactory.openSession();
		session.getTransaction().begin();

		// do your work...

		Product product = (Product) session.get(Product.class, 1122);

		session.getTransaction().commit();
		session.close(); // Detached state

		// --------------------------------------------------

		product.setPrice(3000);

		// ---------------------------------------------------

		System.out.println("=================================");
		
		// --------------------------------------------------

		// Req-2
		 session = sessionFactory.openSession();
		session.getTransaction().begin();

		// do your work...

		session.merge(product);

		session.getTransaction().commit();
		session.close(); // Detached state

		sessionFactory.close();

	}

}
