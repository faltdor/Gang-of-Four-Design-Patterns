package com.faltdor.gof.creational.abstractfactory.factories;

import com.faltdor.gof.creational.abstractfactory.domain.AbstractPizza;

public abstract class BasePizzaFactory {
	public abstract AbstractPizza createPizza(String type);
}
