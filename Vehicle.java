package com.qa.oop;

public class Vehicle {
	protected String model;
	protected String make;
	protected int modelYear;
	
	protected Vehicle(String model, String make, int modelYear) {
		this.model = model;
		this.make = make;
		this.modelYear = modelYear;
	}
	
	public String getModel() {
		return model;
	}
	
	public String getMake() {
		return make;
	}
	
	public int getModelYear() {
		return modelYear;
	}
	
	@Override
	public String toString() {
		return String.format("Vehicle{model=%s,make=%s,modelYear=%d}", model, make, modelYear);
	}
}
