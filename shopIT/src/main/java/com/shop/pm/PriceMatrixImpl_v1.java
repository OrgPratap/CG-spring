package com.shop.pm;

public class PriceMatrixImpl_v1 implements PriceMatrix {

	/* (non-Javadoc)
	 * @see com.shop.pm.PriceMatrix#getprice(java.lang.String)
	 */
	@Override
	public double getprice(String itemCode) {
		// from DB
		// by WS call
		return 100.00;
	}

}
