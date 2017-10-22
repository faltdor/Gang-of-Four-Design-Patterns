package com.faltdor.gof.factory.domain;

public class VeggiePizza extends AbstractPizza {

	@Override
	public void addIngredients() {
		  System.out.println("Preparing ingredients for veggie pizza.");
	}

}
