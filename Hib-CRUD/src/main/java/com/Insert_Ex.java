package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.model.Product;

public class Insert_Ex {

	public static void main(String[] args) {

		Product newProduct = new Product(); // Transient state
		newProduct.setId(7788);
		newProduct.setName("Cam");
		newProduct.setPrice(8000);

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
		session.save(newProduct); // Persistent state

		//newProduct.setPrice(148000);

		session.getTransaction().commit();
		session.close();
		sessionFactory.close();

	}

}
