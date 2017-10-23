package com.faltdor.gof.creational.builder.director;

import com.faltdor.gof.creational.builder.builders.IHouseBuilder;
import com.faltdor.gof.creational.builder.domain.House;

public class ConstructionEngineer {
	private IHouseBuilder houseBuilder;
    public ConstructionEngineer(IHouseBuilder houseBuilder){
        this.houseBuilder = houseBuilder;
    }
 
    public House constructHouse() {
        this.houseBuilder.buildFoundation();
        this.houseBuilder.buildStructure();
        this.houseBuilder.buildRoof();
        this.houseBuilder.paintHouse();
        this.houseBuilder.furnishHouse();
        return this.houseBuilder.getHouse();
 
    }
}
