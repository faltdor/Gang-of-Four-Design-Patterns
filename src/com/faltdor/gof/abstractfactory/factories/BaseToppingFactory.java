package com.faltdor.gof.abstractfactory.factories;

import com.faltdor.gof.abstractfactory.domain.ICheese;
import com.faltdor.gof.abstractfactory.domain.ISauce;

public abstract class BaseToppingFactory {
	public abstract ICheese createCheese();
    public abstract ISauce createSauce();
}
