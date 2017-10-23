package com.faltdor.gof.creational.abstractfactory.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.faltdor.gof.creational.abstractfactory.GourmetPizzaFactory;
import com.faltdor.gof.creational.abstractfactory.domain.AbstractPizza;
import com.faltdor.gof.creational.abstractfactory.factories.BasePizzaFactory;

public class GourmetPizzaFactoryTest {

	@Test
	public void testCreatePizza() throws Exception {
		BasePizzaFactory pizzaFactory = new GourmetPizzaFactory();
		AbstractPizza cheesePizza = pizzaFactory.createPizza("cheese");
		assertNotNull(cheesePizza);
		AbstractPizza veggiePizza = pizzaFactory.createPizza("veggie");
		assertNotNull(veggiePizza);
	}
	
	@Test(expected=IllegalArgumentException.class)	
	public void testCreatePizzaDonotexist() {
		BasePizzaFactory basePizzaFactory = new GourmetPizzaFactory();
		AbstractPizza nullPizza = basePizzaFactory.createPizza("not exist");
		assertNull(nullPizza);
	}

}
