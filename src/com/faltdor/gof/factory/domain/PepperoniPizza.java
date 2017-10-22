package com.faltdor.gof.factory.domain;

public class PepperoniPizza extends AbstractPizza {

	@Override
	public void addIngredients() {
		 System.out.println("Preparing ingredients for pepperoni pizza.");
	}

}
