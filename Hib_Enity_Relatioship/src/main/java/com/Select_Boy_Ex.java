package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.model.Boy;
import com.model.Girl;

public class Select_Boy_Ex {

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

		Boy boy = (Boy) session.get(Boy.class, 33);
		System.out.println(boy.getName());
		System.out.println(boy.getGirl().getName());

		session.getTransaction().commit();
		session.close();
		sessionFactory.close();

	}

}
