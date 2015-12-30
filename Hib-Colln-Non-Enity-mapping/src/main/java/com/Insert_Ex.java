package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.model.Address;
import com.model.Employee;

public class Insert_Ex {

	public static void main(String[] args) {

		Employee employee = new Employee();
		employee.setId(123);
		employee.setName("Nag");

		Address address = new Address();
		address.setCity("BLR");
		address.setCountry("IND");

		Address homeAddress = new Address();
		homeAddress.setCity("CHN");
		homeAddress.setCountry("IND");

		employee.getAddresses().add(address);
		employee.getAddresses().add(homeAddress);
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
		session.save(employee);

		session.getTransaction().commit();
		session.close();
		sessionFactory.close();

	}

}
