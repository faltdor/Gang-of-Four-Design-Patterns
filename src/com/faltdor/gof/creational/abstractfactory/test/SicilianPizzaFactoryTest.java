package com.faltdor.gof.creational.abstractfactory.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.faltdor.gof.creational.abstractfactory.SicilianPizzaFactory;
import com.faltdor.gof.creational.abstractfactory.domain.AbstractPizza;
import com.faltdor.gof.creational.abstractfactory.factories.BasePizzaFactory;

public class SicilianPizzaFactoryTest {

	@Test
    public void testCreatePizza() throws Exception {
        BasePizzaFactory pizzaFactory=new SicilianPizzaFactory();
        
        AbstractPizza cheesePizza=pizzaFactory.createPizza("cheese");
    	assertNotNull(cheesePizza);
    	
    	AbstractPizza pepperoniPizza =pizzaFactory.createPizza("pepperoni");
    	assertNotNull(pepperoniPizza);
    }
	
	@Test(expected=IllegalArgumentException.class)	
	public void testCreatePizzaDonotexist() {
		BasePizzaFactory basePizzaFactory = new SicilianPizzaFactory();
		AbstractPizza nullPizza = basePizzaFactory.createPizza("not exist");
		assertNull(nullPizza);
	}
	
	
	

}
