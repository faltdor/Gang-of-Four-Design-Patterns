package com.faltdor.gof.abstractfactory.factories;

import com.faltdor.gof.abstractfactory.domain.AbstractPizza;

public abstract class BasePizzaFactory {
	public abstract AbstractPizza createPizza(String type);
}
