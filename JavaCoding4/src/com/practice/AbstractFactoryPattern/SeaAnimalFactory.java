package com.practice.AbstractFactoryPattern;


public class SeaAnimalFactory extends AnimalFactory {
   @Override
	public Animal getAnimal(String animalType){
    	Animal animal = null;
    	if("Dolphin".equalsIgnoreCase(animalType)){
    		animal = new Dolphin();
       	}
    	if("Fish".equalsIgnoreCase(animalType)){
    		animal = new Fish();
       	}
    	return animal;
    }
}
