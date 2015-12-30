package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.model.Boy;
import com.model.Girl;

public class Select_Girl_Ex {

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

		Girl girl = (Girl) session.get(Girl.class, 44);
		System.out.println(girl.getName());
		System.out.println(girl.getBoy().getName());

		session.getTransaction().commit();
		session.close();
		sessionFactory.close();

	}

}
