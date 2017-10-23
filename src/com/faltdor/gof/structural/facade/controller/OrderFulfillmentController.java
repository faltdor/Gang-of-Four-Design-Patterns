package com.faltdor.gof.structural.facade.controller;

import com.faltdor.gof.structural.facade.servicefacade.OrderServiceFacade;

public class OrderFulfillmentController {
	OrderServiceFacade facade;
	
    public OrderFulfillmentController(OrderServiceFacade facade) {
		this.facade = facade;
	}

	boolean orderFulfilled=false;
    
    public boolean orderProduct(int productId) {
        orderFulfilled=facade.placeOrder(productId);
        System.out.println("OrderFulfillmentController: Order fulfillment completed. ");
        return orderFulfilled;
    }
}
