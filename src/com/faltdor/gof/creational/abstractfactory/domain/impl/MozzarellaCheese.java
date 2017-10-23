package com.faltdor.gof.creational.abstractfactory.domain.impl;

import com.faltdor.gof.creational.abstractfactory.domain.ICheese;

public class MozzarellaCheese implements ICheese {

	public MozzarellaCheese() {
		prepareCheese();
	} 

	@Override
	public void prepareCheese() {
		System.out.println("Preparing mozzarella cheese...");
	}

}
