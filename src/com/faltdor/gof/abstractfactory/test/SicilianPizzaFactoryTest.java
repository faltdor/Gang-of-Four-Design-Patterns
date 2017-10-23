package com.faltdor.gof.abstractfactory.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.faltdor.gof.abstractfactory.SicilianPizzaFactory;
import com.faltdor.gof.abstractfactory.domain.AbstractPizza;
import com.faltdor.gof.abstractfactory.factories.BasePizzaFactory;

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
