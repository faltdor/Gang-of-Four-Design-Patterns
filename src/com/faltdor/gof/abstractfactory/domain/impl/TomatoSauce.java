package com.faltdor.gof.abstractfactory.domain.impl;

import com.faltdor.gof.abstractfactory.domain.ISauce;

public class TomatoSauce implements ISauce {
	public TomatoSauce() {
		prepareSauce();
	}

	@Override
	public void prepareSauce() {
		System.out.println("Preparing tomato sauce..");
	}
}
