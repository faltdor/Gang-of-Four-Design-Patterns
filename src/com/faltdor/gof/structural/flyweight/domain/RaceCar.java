package com.faltdor.gof.structural.flyweight.domain;

public abstract class RaceCar {
	/* Intrinsic state stored and shared in the Flyweight object */
	public String name;
	public int speed;
	public int horsePower;

	/*
	 * Extrinsic state is stored or computed by client objects, and passed to the
	 * Flyweight.
	 */
	abstract public void moveCar(int currentX, int currentY, int newX, int newY);

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getHorsePower() {
		return horsePower;
	}

	public void setHorsePower(int horsePower) {
		this.horsePower = horsePower;
	}
	
	
}
