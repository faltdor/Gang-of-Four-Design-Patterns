package com.faltdor.gof.creational.abstractfactory.domain.impl;

import com.faltdor.gof.creational.abstractfactory.domain.ICheese;

public class GoatCheese implements ICheese {

	public GoatCheese() {
		prepareCheese();
	}

	@Override
	public void prepareCheese() {
		System.out.println("Preparing goat cheese...");
	}

}
