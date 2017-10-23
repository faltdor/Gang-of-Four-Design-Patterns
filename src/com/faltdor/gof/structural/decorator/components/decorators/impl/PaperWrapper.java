package com.faltdor.gof.structural.decorator.components.decorators.impl;

import com.faltdor.gof.structural.decorator.components.FlowerBouquet;
import com.faltdor.gof.structural.decorator.components.decorators.FlowerBouquetDecorator;

public class PaperWrapper extends FlowerBouquetDecorator {
	
	 FlowerBouquet flowerBouquet;
     public PaperWrapper(FlowerBouquet flowerBouquet){
         this.flowerBouquet=flowerBouquet;
     }
     

	@Override
	public String getDescription() {
		 return flowerBouquet.getDescription()+", paper wrap";
	}

	@Override
	public double cost() {
		return 3+flowerBouquet.cost();
	}

}
