package com.faltdor.gof.structural.decorator.components;

public abstract class FlowerBouquet {
	protected String description;

	public String getDescription() {
		return description;
	}

	public abstract double cost();

}
