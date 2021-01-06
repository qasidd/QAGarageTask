package com.qa.oop;

public class Motorcycle extends Vehicle {
	private int topSpeed;
	
	public Motorcycle(String model, String make, int modelYear, int topSpeed) {
		super(model, make, modelYear);
		this.topSpeed = topSpeed;
	}
	
	public int getTopSpeed() {
		return topSpeed;
	}
	
	public void setTopSpeed(int topSpeed) {
		this.topSpeed = topSpeed;
	}
}
