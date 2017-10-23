package com.faltdor.gof.creational.abstractfactory.domain.impl;

import com.faltdor.gof.creational.abstractfactory.domain.ISauce;

public class CaliforniaOilSauce implements ISauce {

	public CaliforniaOilSauce() {
		prepareSauce();
	}

	@Override
	public void prepareSauce() {
		System.out.println("Preparing california oil sauce..");
	}

}
