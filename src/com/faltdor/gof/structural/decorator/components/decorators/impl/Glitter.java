package com.faltdor.gof.structural.decorator.components.decorators.impl;

import com.faltdor.gof.structural.decorator.components.FlowerBouquet;
import com.faltdor.gof.structural.decorator.components.decorators.FlowerBouquetDecorator;

public class Glitter extends FlowerBouquetDecorator {
	
	 FlowerBouquet flowerBouquet;
     public Glitter(FlowerBouquet flowerBouquet){
         this.flowerBouquet=flowerBouquet;
     }
     

	@Override
	public String getDescription() {
		 return flowerBouquet.getDescription()+", glitter";
	}

	@Override
	public double cost() {
		return 4+flowerBouquet.cost();
	}

}
