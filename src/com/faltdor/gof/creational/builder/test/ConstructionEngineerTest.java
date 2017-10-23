package com.faltdor.gof.creational.builder.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.faltdor.gof.creational.builder.builders.ConcreteHouseBuilder;
import com.faltdor.gof.creational.builder.builders.IHouseBuilder;
import com.faltdor.gof.creational.builder.builders.PrefabricatedHouseBuilder;
import com.faltdor.gof.creational.builder.director.ConstructionEngineer;
import com.faltdor.gof.creational.builder.domain.House;

public class ConstructionEngineerTest {

	@Test
	public void testConstructHouse() throws Exception {
		
        IHouseBuilder concreteHouseBuilder = new ConcreteHouseBuilder();
        
        ConstructionEngineer engineerA = new ConstructionEngineer(concreteHouseBuilder);
        House houseA = engineerA.constructHouse();
        System.out.println("House is: "+houseA);
        assertNotNull(houseA);
        
        PrefabricatedHouseBuilder prefabricatedHouseBuilder = new PrefabricatedHouseBuilder();
        ConstructionEngineer engineerB = new ConstructionEngineer(prefabricatedHouseBuilder);
        
        House houseB = engineerB.constructHouse();
        System.out.println("House is: "+houseB);
        assertNotNull(houseB);
        
        
    }
}
