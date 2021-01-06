package com.qa.oop;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Garage {
	private List<Vehicle> garage;

	public Garage() {
		garage = new ArrayList<>();
	}

	public List<Vehicle> getGarage() {
		return garage;
	}

	public void add(Vehicle v) {
		garage.add(v);
	}

	public int calculateBill() {
		return garage.stream()
				.mapToInt(v -> {
					if (v.getClass() == Car.class) {
						return 20000;
					} else if (v.getClass() == Motorcycle.class) {
						return 10000;
					} else if (v.getClass() == Train.class) {
						return 50000;
					}
					return 25000;
				})
				.sum();
	}
	
	public void removeByModel(String model) {
		garage = garage.stream()
					.filter(v -> !(v.getModel().equalsIgnoreCase(model)))
					.collect(Collectors.toList());
	}
	
	public void removeByMake(String make) {
		garage = garage.stream()
					.filter(v -> !(v.getMake().equalsIgnoreCase(make)))
					.collect(Collectors.toList());
	}
	
	public void empty() {
		garage.clear();
	}
	
	@Override
	public String toString() {
		return "Garage{" + garage + "}";
	}
}
