package com.elan.dp.factory;

/**
 * @author Elanchezhian
 *
 */
public class PurchaseOrder implements IOrder
{

   public void product()
   {

       System.out.println("PurchaseOrder called for product");
}
   public void price()
   {

      System.out.println("PurchaseOrder called for price");

	}

}