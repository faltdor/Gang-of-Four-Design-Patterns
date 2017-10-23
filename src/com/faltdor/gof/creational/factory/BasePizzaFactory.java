package com.faltdor.gof.creational.factory;

import com.faltdor.gof.creational.factory.domain.AbstractPizza;

public abstract class BasePizzaFactory {
	public abstract AbstractPizza createPizza(String type);
}
