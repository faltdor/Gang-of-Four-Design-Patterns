package com.faltdor.gof.creational.abstractfactory.domain.impl;

import com.faltdor.gof.creational.abstractfactory.domain.AbstractPizza;
import com.faltdor.gof.creational.abstractfactory.factories.BaseToppingFactory;

public class PepperoniPizza extends AbstractPizza {

	BaseToppingFactory toppingFactory;

	public PepperoniPizza(BaseToppingFactory toppingFactory) {
		this.toppingFactory = toppingFactory;
	}

	@Override
	public void addIngredients() {
		System.out.println("Preparing ingredients for pepperoni pizza.");
		toppingFactory.createCheese();
		toppingFactory.createSauce();
	}

}
