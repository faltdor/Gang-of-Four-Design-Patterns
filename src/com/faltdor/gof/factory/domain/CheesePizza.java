package com.faltdor.gof.factory.domain;

public class CheesePizza extends AbstractPizza {

	@Override
	public void addIngredients() {
		System.out.println("Preparing ingredients for cheese pizza.");
	}

}
