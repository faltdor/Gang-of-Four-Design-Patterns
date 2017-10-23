package com.faltdor.gof.structural.decorator.components.impl;

import com.faltdor.gof.structural.decorator.components.FlowerBouquet;

public class RoseBouquet extends FlowerBouquet {
	
	public RoseBouquet(){
        description = "Rose bouquet";
    }
	
	@Override
	public double cost() {
		return 12.0;
	}

}
