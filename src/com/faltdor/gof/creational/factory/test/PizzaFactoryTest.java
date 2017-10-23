package com.faltdor.gof.creational.factory.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.faltdor.gof.creational.factory.BasePizzaFactory;
import com.faltdor.gof.creational.factory.PizzaFactory;
import com.faltdor.gof.creational.factory.domain.AbstractPizza;

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
