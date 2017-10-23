package com.faltdor.gof.abstractfactory.domain.impl;

import com.faltdor.gof.abstractfactory.domain.ICheese;

public class MozzarellaCheese implements ICheese {

	public MozzarellaCheese() {
		prepareCheese();
	}

	@Override
	public void prepareCheese() {
		System.out.println("Preparing mozzarella cheese...");
	}

}
