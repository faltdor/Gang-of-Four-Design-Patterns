package com.faltdor.gof.creational.singleton.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.faltdor.gof.creational.singleton.domain.FactoryManager;

public class SingletonFactoryMannagerTest {

	@Test
	public void testStartTracks() {
		FactoryManager factoryManager = FactoryManager.getInstance();
		assertNotNull(factoryManager);
		
		factoryManager.startTracks();
        
        
	}

}
