package com.qa.oop;

public class Train extends Vehicle {
	private String operator;
	
	public Train(String model, String make, int modelYear, String operator) {
		super(model, make, modelYear);
		this.operator = operator;
	}
	
	public String getOperator() {
		return operator;
	}
	
	public void setOperator(String operator) {
		this.operator = operator;
	}
}
