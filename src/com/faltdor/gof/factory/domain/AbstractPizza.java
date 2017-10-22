package com.faltdor.gof.factory.domain;

public abstract class AbstractPizza {

	public abstract void addIngredients();
	
	public void bakePizza() {
	        System.out.println("Pizza baked at 400 for 20 minutes.");
	}
}
