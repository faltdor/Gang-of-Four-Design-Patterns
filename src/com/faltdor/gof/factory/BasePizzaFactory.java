package com.faltdor.gof.factory;

import com.faltdor.gof.factory.domain.AbstractPizza;

public abstract class BasePizzaFactory {
	public abstract AbstractPizza createPizza(String type);
}
