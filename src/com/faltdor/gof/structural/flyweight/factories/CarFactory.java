package com.faltdor.gof.structural.flyweight.factories;

import java.util.HashMap;
import java.util.Map;

import com.faltdor.gof.structural.flyweight.domain.RaceCar;
import com.faltdor.gof.structural.flyweight.domain.impl.FlyweightMidgetCar;
import com.faltdor.gof.structural.flyweight.domain.impl.FlyweightSprintCar;

public class CarFactory {
	 private static Map<String, RaceCar> flyweights = new HashMap<>();
	    /*If key exist, return flyweight from Map*/
	    public static RaceCar getRaceCar(String key) {
	        if(flyweights.containsKey(key)){
	            return flyweights.get(key);
	        }
	        RaceCar raceCar;
	        /*If key does not exist in Map, create flyweight, put it in Map, and return the object*/
	        switch (key)
	        {
	            case "Midget":
	                raceCar = new FlyweightMidgetCar();
	                raceCar.setName("Midget Car");
	                raceCar.setSpeed(140);
	                raceCar.setHorsePower(400);
	                break;
	            case "Sprint":
	                raceCar = new FlyweightSprintCar();
	                raceCar.setName("Sprint Car");
	                raceCar.setSpeed(160);
	                raceCar.setHorsePower(1000);
	                break;
	            default:
	                throw new IllegalArgumentException("Unsupported car type.");
	        }
	        flyweights.put(key, raceCar);
	        return raceCar;
	    }
}
