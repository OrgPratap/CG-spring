package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.model.Boy;
import com.model.Girl;

public class Save_Girl_Ex {

	public static void main(String[] args) {

		Girl girl = new Girl();
		girl.setId(22);
		girl.setName("GIRL");

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
		session.save(girl);

		session.getTransaction().commit();
		session.close();
		sessionFactory.close();

	}

}
