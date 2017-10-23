package com.faltdor.gof.builder.builders;

import com.faltdor.gof.builder.domain.House;
 
public interface IHouseBuilder {
	void buildFoundation();
    void buildStructure();
    void buildRoof();
    void paintHouse();
    void furnishHouse();
    House getHouse();
}
