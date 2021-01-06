package com.qa.oop;

public class Runner {

	public static void main(String[] args) {
		// Inheritance
//		Animal dog = new Dog("Bill");
//		Animal cat = new Cat("Simon");
//		Animal lion = new Lion(true);
//		
//		System.out.println(dog);
//		System.out.println(dog.noise());
//		System.out.println(cat);
//		System.out.println(cat.noise());
//		System.out.println(lion);
//		System.out.println(lion.noise());
//		System.out.println(((Lion) lion).isKing());
		
		// Singleton
//		System.out.println(SingletonExample.getInstance().getN());
		
		// Division with Exceptions
		
		// Person
//		Person p1 = new Person("John", 35, "Bus driver");
//		Person p2 = new Person("Jill", 27, "Actor");
//		Person p3 = new Person("Calvin", 87, "Retired");
//		
//		List<Person> personList = new ArrayList<>();
//		personList.add(p1);
//		personList.add(p2);
//		personList.add(p3);
//		personList.stream().forEach(System.out::println);
//		System.out.println(Person.searchByName("John", personList));
		
		// Garage
		Garage garage = new Garage();
		garage.add(new Car("Model S", "Tesla", 2012, true));
		garage.add(new Car("Cybertruck", "Tesla", 2019, true));
		garage.add(new Motorcycle("LS-218", "Lightning", 2014, 218));
		garage.add(new Train("CR400AF", "CRRC Sifang", 2017, "China Railway"));
		System.out.println(garage.calculateBill());
		garage.removeByMake("Tesla");
		System.out.println(garage);
		
		// Paint Wizard
//		PaintWizard.cheapest();
	}
}
