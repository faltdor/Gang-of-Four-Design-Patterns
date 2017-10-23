package com.faltdor.gof.creational.builder.builders;

import com.faltdor.gof.creational.builder.domain.House;
 
public interface IHouseBuilder {
	void buildFoundation();
    void buildStructure();
    void buildRoof();
    void paintHouse();
    void furnishHouse();
    House getHouse();
}
