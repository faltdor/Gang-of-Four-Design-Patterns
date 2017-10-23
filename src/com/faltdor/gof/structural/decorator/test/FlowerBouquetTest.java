package com.faltdor.gof.structural.decorator.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.faltdor.gof.structural.decorator.components.FlowerBouquet;
import com.faltdor.gof.structural.decorator.components.decorators.impl.Glitter;
import com.faltdor.gof.structural.decorator.components.decorators.impl.PaperWrapper;
import com.faltdor.gof.structural.decorator.components.decorators.impl.RibbonBow;
import com.faltdor.gof.structural.decorator.components.impl.OrchidBouquet;
import com.faltdor.gof.structural.decorator.components.impl.RoseBouquet;

public class FlowerBouquetTest {

	@SuppressWarnings("deprecation")
	@Test
	public void testFlowerBouquet() {
		/*Rose bouquet with no decoration:
		 * Rose bouquet;
		 * 12.0;
		 * */
		
        FlowerBouquet roseBouquet = new RoseBouquet();
        String description = "Rose bouquet";
		assertEquals(description, roseBouquet.getDescription());
        System.out.println(roseBouquet.getDescription()
                + " $ " + roseBouquet.cost());
        
        /*Rose bouquet with paper wrapper, ribbon bow, and glitter*/
        FlowerBouquet decoratedRoseBouquet = new RoseBouquet();
        decoratedRoseBouquet=new PaperWrapper(decoratedRoseBouquet);
        
        decoratedRoseBouquet=new RibbonBow(decoratedRoseBouquet);
        
        decoratedRoseBouquet=new Glitter(decoratedRoseBouquet);
        System.out.println(decoratedRoseBouquet.getDescription()
                + " $ " + decoratedRoseBouquet.cost());
 
        /*Orchid bouquet with double paper wrapper and ribbon bow*/
        FlowerBouquet decoratedOrchidBouquet = new OrchidBouquet();
        decoratedOrchidBouquet=new PaperWrapper(decoratedOrchidBouquet);
        decoratedOrchidBouquet=new PaperWrapper(decoratedOrchidBouquet);
        decoratedOrchidBouquet=new RibbonBow(decoratedOrchidBouquet);
        System.out.println(decoratedOrchidBouquet.getDescription()
                + " $ " + decoratedOrchidBouquet.cost()); 
	}

}
