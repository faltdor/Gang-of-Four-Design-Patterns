package com.faltdor.gof.factory.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.faltdor.gof.factory.BasePizzaFactory;
import com.faltdor.gof.factory.PizzaFactory;
import com.faltdor.gof.factory.domain.AbstractPizza;

public class PizzaFactoryTest {

	@Test
	public void testCreatePizza() {
		BasePizzaFactory basePizzaFactory = new PizzaFactory();
		AbstractPizza cheesePizza = basePizzaFactory.createPizza("cheese");
		assertNotNull(cheesePizza);
		
		AbstractPizza veggiePizza = basePizzaFactory.createPizza("veggie");
		assertNotNull(veggiePizza);
	}
	
	@Test(expected=IllegalArgumentException.class)	
	public void testCreatePizzaDonotexist() {
		BasePizzaFactory basePizzaFactory = new PizzaFactory();
		AbstractPizza nullPizza = basePizzaFactory.createPizza("not exist");
		assertNull(nullPizza);
	}
	
	
	

}
