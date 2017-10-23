package com.faltdor.gof.structural.facade.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.faltdor.gof.structural.facade.controller.OrderFulfillmentController;
import com.faltdor.gof.structural.facade.servicefacade.impl.OrderServiceFacadeImpl;

public class OrderFulfillmentControllerTest {

	@Test
	public void testOrderProduct() {
		OrderFulfillmentController controller = new OrderFulfillmentController(new OrderServiceFacadeImpl());
		boolean result = controller.orderProduct(9);
		assertTrue(result);
	}

}
