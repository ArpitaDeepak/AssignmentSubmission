package com.practice.AbstractFactoryPattern;


public abstract class AnimalFactory {
    public abstract Animal getAnimal(String animalType);
    public static AnimalFactory getAnimalFactory(String factoryType){
    	AnimalFactory animalFac = null;
    	if("Sea".equals(factoryType)){
    		animalFac = new SeaAnimalFactory();
    	}
    	else{
    		animalFac = new LandAnimalFactory(); 
    	}
    	return animalFac;
    }
    
}
