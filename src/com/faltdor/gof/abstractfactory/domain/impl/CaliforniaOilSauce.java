package com.faltdor.gof.abstractfactory.domain.impl;

import com.faltdor.gof.abstractfactory.domain.ISauce;

public class CaliforniaOilSauce implements ISauce {

	public CaliforniaOilSauce() {
		prepareSauce();
	}

	@Override
	public void prepareSauce() {
		System.out.println("Preparing california oil sauce..");
	}

}
