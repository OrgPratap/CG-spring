package com.shop.bill;

import com.shop.pm.PriceMatrix;

/*
 *  OO principle
 *  
 *  " Closed for modification , Open for Extension"
 * 
 */

/*
 *  design and performance issues
 *  -----------------------------
 *  
 *  --> tight-coupling
 *  
 *      Maintainance issues , cant't extend with new features
 *  
 *  --> too many dependencies are created/destructed.
 *  
 *      memory , slow , too many resources used
 *  
 *  --> Unit-Testing Not Possible 
 *  
 *      bug fix slow ,  cant ensure comp functionality
 *      
 *      
 *      
 *      
 *      
 *      
 *      why these issues are raising in this comp?
 *      
 *      
 *      dependent itself creating it's own dependency
 *      
 *      Soln:
 *      
 *      --> don't create , do lookup
 *      
 *      Limitation on Lookup:
 *      
 *      -->location tight coupling
 *      
 *      best soln :
 *      
 *      dont create , dont lookup , get/inject by 'some-one'  ( IOC )
 *      
 *      
 *      
 *      how to implement IOC ?
 *      
 *      by
 *      
 *         'dEPENDECY iNJECTION ' ( DI )
 *         
 *         ways to inject dependency to dependent ?
 *         
 *         --> constructor
 *         --> setter
 *         
 *      
 *      
 *      ---------------------------------------------
 *      
 * 
 */

public class BillingImpl implements Billing {

	private PriceMatrix priceMatrix;

	public BillingImpl(PriceMatrix priceMatrix) {
		super();
		this.priceMatrix = priceMatrix;
	}

	/* (non-Javadoc)
	 * @see com.shop.bill.Billing#getTotalPrice(java.lang.String[])
	 */
	@Override
	public double getTotalPrice(String[] cart) {

		double total = 0.0;
		for (String itemCode : cart) {
			total += priceMatrix.getprice(itemCode);
		}

		return total;

	}
	
	

}
