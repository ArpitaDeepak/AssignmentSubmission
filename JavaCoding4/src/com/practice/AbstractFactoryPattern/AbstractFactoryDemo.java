package com.practice.AbstractFactoryPattern;


public class AbstractFactoryDemo {

	public static void main(String[] args) {
		AnimalFactory animalFac;
		Animal animal;
	    animalFac = AnimalFactory.getAnimalFactory("Land");
		System.out.println("Animal factory type is:" +animalFac.getClass().getName());
		animal= animalFac.getAnimal("Lion");
		System.out.println("Animal type is:" + animal.getClass().getName());
		System.out.println("Animal sounds:" + animal.speak());
		animalFac = AnimalFactory.getAnimalFactory("Sea");
		System.out.println("Animal factory type is:" +animalFac.getClass().getName());
		animal= animalFac.getAnimal("Dolphin");
		System.out.println("Animal type is:" + animal.getClass().getName());
		System.out.println("Animal sounds:" + animal.speak());
	}

}
