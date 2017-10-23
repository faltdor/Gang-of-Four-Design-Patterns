package com.faltdor.gof.abstractfactory.factories.impl;

import com.faltdor.gof.abstractfactory.domain.ICheese;
import com.faltdor.gof.abstractfactory.domain.ISauce;
import com.faltdor.gof.abstractfactory.domain.impl.CaliforniaOilSauce;
import com.faltdor.gof.abstractfactory.domain.impl.GoatCheese;
import com.faltdor.gof.abstractfactory.factories.BaseToppingFactory;

public class GourmetToppingFactory extends BaseToppingFactory {

	@Override
	public ICheese createCheese() {
		return new GoatCheese();
	}

	@Override
	public ISauce createSauce() {
		return new CaliforniaOilSauce();
	}
}
