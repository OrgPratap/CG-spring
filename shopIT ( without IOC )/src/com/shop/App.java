package com.shop;

import com.shop.bill.BillingImpl;

public class App {

	public static void main(String[] args) {

		// Init phase

		BillingImpl billComp = new BillingImpl();

		// Use/Service phase

		String[] cart = { "234", "345" };
		double total = billComp.getTotalPrice(cart);
		System.out.println("Total :" + total);

		// Destroy Phase
		billComp = null;

		// System.out.println("Happy Appln flow");

	}

}
