package com.faltdor.gof.abstractfactory.factories.impl;

import com.faltdor.gof.abstractfactory.domain.ICheese;
import com.faltdor.gof.abstractfactory.domain.ISauce;
import com.faltdor.gof.abstractfactory.domain.impl.MozzarellaCheese;
import com.faltdor.gof.abstractfactory.domain.impl.TomatoSauce;
import com.faltdor.gof.abstractfactory.factories.BaseToppingFactory;

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
