package com.faltdor.gof.creational.abstractfactory.factories.impl;

import com.faltdor.gof.creational.abstractfactory.domain.ICheese;
import com.faltdor.gof.creational.abstractfactory.domain.ISauce;
import com.faltdor.gof.creational.abstractfactory.domain.impl.MozzarellaCheese;
import com.faltdor.gof.creational.abstractfactory.domain.impl.TomatoSauce;
import com.faltdor.gof.creational.abstractfactory.factories.BaseToppingFactory;

public class SicillianToppingFactory extends BaseToppingFactory {

	@Override
	public ICheese createCheese() {
		return new MozzarellaCheese();
	}

	@Override
	public ISauce createSauce() {
		return new TomatoSauce();
	}

}
