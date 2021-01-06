package com.qa.oop;

public class Car extends Vehicle {
	private boolean selfDriving;
	
	public Car(String model, String make, int modelYear, boolean selfDriving) {
		super(model, make, modelYear);
		this.selfDriving = selfDriving;
	}
	
	public boolean isSelfDriving() {
		return selfDriving;
	}
	
	public void setSelfDriving(boolean selfDriving) {
		this.selfDriving = selfDriving;
	}
}
