package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.model.Boy;
import com.model.Girl;

public class Save_Boy_Ex {

	public static void main(String[] args) {

		Boy boy = new Boy();
		boy.setId(33);
		boy.setName("BOY");
		
		Girl girl = new Girl();
		girl.setId(44);
		girl.setName("GIRL");
		
		boy.setGirl(girl);

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
		//session.save(girl);
		session.save(boy);

		session.getTransaction().commit();
		session.close();
		sessionFactory.close();

	}

}
