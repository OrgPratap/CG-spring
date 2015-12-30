package com;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

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

public class Select_Ex {

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

		// way-1: by primary key
		// Product product = (Product) session.get(Product.class, 1122); //
		// persistent state
		// System.out.println(product);

		// product.setPrice(1000);

		// way-2 : HQL

		/*
		 * Limitation of SQL
		 * 
		 * --> partialy depends DBMS --> structure oriented..
		 * 
		 * adv HQL
		 * 
		 * --> DBMS independent --> OO
		 */
		//
		// String hql = "from Product p where p.price<:prod_price";
		// Query query = session.createQuery(hql);
		// query.setParameter("prod_price", 150000.00);
		// query.setFirstResult(0);
		// query.setMaxResults(4);
		//
		// List<Product> products = query.list();
		//
		// for (Product prod : products) {
		// System.out.println(prod);
		// }

		// way-3: Criteria API
		// Criteria criteria = session.createCriteria(Product.class);
		// criteria.add(Restrictions.lt("price", 150000.00));
		// List<Product> list = criteria.list();
		//
		// for (Product prod : list) {
		// System.out.println(prod);
		// }

		// WAY-4: nATIVE sql

		String sql = "select * from Product";
		SQLQuery query = session.createSQLQuery(sql).addEntity(Product.class);
		List<Product> list = query.list();

		for (Product prod : list) {
			System.out.println(prod);
		}

		session.getTransaction().commit();
		session.close();
		sessionFactory.close();

	}

}
