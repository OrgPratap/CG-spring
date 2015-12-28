package com.shop.bill;

import com.shop.pm.PriceMatrixImpl_v1;

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

public class BillingImpl {

	private PriceMatrixImpl_v1 priceMatrix;

	public double getTotalPrice(String[] cart) {

		double total = 0.0;
		this.priceMatrix = new PriceMatrixImpl_v1();
		for (String itemCode : cart) {
			total += priceMatrix.getprice(itemCode);
		}

		return total;

	}

}
