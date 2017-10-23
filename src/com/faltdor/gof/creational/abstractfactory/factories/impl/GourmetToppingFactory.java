package com.faltdor.gof.creational.abstractfactory.factories.impl;

import com.faltdor.gof.creational.abstractfactory.domain.ICheese;
import com.faltdor.gof.creational.abstractfactory.domain.ISauce;
import com.faltdor.gof.creational.abstractfactory.domain.impl.CaliforniaOilSauce;
import com.faltdor.gof.creational.abstractfactory.domain.impl.GoatCheese;
import com.faltdor.gof.creational.abstractfactory.factories.BaseToppingFactory;

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
