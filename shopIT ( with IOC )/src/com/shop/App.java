package com.shop;

import com.shop.bill.Billing;
import com.shop.bill.BillingImpl;
import com.shop.pm.PriceMatrix;
import com.shop.pm.PriceMatrixImpl_v1;
import com.shop.pm.PriceMatrixImpl_v2;

public class App {

	public static void main(String[] args) {

		// Init phase

		// 'some-one'// container

		PriceMatrix priceMatrixV1 = new PriceMatrixImpl_v1();
		PriceMatrix priceMatrixV2 = new PriceMatrixImpl_v2();

		Billing billComp1 = new BillingImpl(priceMatrixV1); // C- DI
		Billing billComp2 = new BillingImpl(priceMatrixV2); // C- DI

		// Use/Service phase

		String[] cart = { "234", "345" };
		double total = billComp2.getTotalPrice(cart);
		System.out.println("Total :" + total);

		// Destroy Phase

	}

}
