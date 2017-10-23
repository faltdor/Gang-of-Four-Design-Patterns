package com.faltdor.gof.abstractfactory.domain.impl;

import com.faltdor.gof.abstractfactory.domain.AbstractPizza;
import com.faltdor.gof.abstractfactory.factories.BaseToppingFactory;

public class CheesePizza extends AbstractPizza {

	BaseToppingFactory toppingFactory;

	public CheesePizza(BaseToppingFactory toppingFactory) {
		this.toppingFactory = toppingFactory;
	}

	@Override
	public void addIngredients() {
		System.out.println("Preparing ingredients for cheese pizza.");
		toppingFactory.createCheese();
		toppingFactory.createSauce();
	}

}
