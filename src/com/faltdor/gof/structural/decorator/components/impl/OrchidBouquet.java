package com.faltdor.gof.structural.decorator.components.impl;

import com.faltdor.gof.structural.decorator.components.FlowerBouquet;

public class OrchidBouquet extends FlowerBouquet {
	
	public OrchidBouquet() {
		description = "Orchid bouquet";
	}

	public double cost() {
		return 29.0;
	}
}