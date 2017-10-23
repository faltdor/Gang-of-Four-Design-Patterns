package com.faltdor.gof.abstractfactory.domain.impl;

import com.faltdor.gof.abstractfactory.domain.ICheese;

public class GoatCheese implements ICheese {

	public GoatCheese() {
		prepareCheese();
	}

	@Override
	public void prepareCheese() {
		System.out.println("Preparing goat cheese...");
	}

}
