package com.faltdor.gof.abstractfactory.domain.impl;

import com.faltdor.gof.abstractfactory.domain.AbstractPizza;
import com.faltdor.gof.abstractfactory.factories.BaseToppingFactory;

public class VeggiePizza extends AbstractPizza {

	BaseToppingFactory toppingFactory;

	public VeggiePizza(BaseToppingFactory toppingFactory) {
		this.toppingFactory = toppingFactory;
	}

	@Override
	public void addIngredients() {
		System.out.println("Preparing ingredients for veggie pizza.");
		toppingFactory.createCheese();
		toppingFactory.createSauce();
	}

}
