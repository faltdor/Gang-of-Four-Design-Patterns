package com.faltdor.gof.factory.domain.impl;

import com.faltdor.gof.factory.domain.AbstractPizza;

public class CheesePizza extends AbstractPizza {

	@Override
	public void addIngredients() {
		System.out.println("Preparing ingredients for cheese pizza.");
	}

}
