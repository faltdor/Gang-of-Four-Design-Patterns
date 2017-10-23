package com.faltdor.gof.creational.abstractfactory.factories;

import com.faltdor.gof.creational.abstractfactory.domain.ICheese;
import com.faltdor.gof.creational.abstractfactory.domain.ISauce;

public abstract class BaseToppingFactory {
	public abstract ICheese createCheese();
    public abstract ISauce createSauce();
}
