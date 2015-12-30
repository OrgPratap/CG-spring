package com.mts;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.mts.model.Account;
import com.mts.model.AccountStatus;
import com.mts.model.AccountType;

public class Insert_Ex {

	public static void main(String[] args) {

		Account newAccount = new Account();
		newAccount.setNum("4");
		newAccount.setName("Nag");
		newAccount.setBalance(1000);
		newAccount.setType(AccountType.SAVING);
		newAccount.setStatus(AccountStatus.ACTIVE);

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
		session.save(newAccount);

		session.getTransaction().commit();
		session.close();

	}

}
