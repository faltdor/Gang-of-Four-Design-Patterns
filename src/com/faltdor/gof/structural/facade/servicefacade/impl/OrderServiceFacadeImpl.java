package com.faltdor.gof.structural.facade.servicefacade.impl;

import com.faltdor.gof.structural.facade.domain.Product;
import com.faltdor.gof.structural.facade.servicefacade.OrderServiceFacade;
import com.faltdor.gof.structural.facade.subcomponents.InventoryService;
import com.faltdor.gof.structural.facade.subcomponents.PaymentService;
import com.faltdor.gof.structural.facade.subcomponents.ShippingService;

public class OrderServiceFacadeImpl implements OrderServiceFacade {

	@Override
	public boolean placeOrder(int productId) {
		boolean orderFulfilled = false;
		
		Product product = new Product();
		
		product.productId = productId;
		
		if (InventoryService.isAvailable(product)) {
			System.out.println("Product with ID: " + product.productId + " is available.");
			boolean paymentConfirmed = PaymentService.makePayment();
			if (paymentConfirmed) {
				System.out.println("Payment confirmed...");
				ShippingService.shipProduct(product);
				System.out.println("Product shipped...");
				orderFulfilled = true;
			}
		}
		return orderFulfilled;
	}

}
