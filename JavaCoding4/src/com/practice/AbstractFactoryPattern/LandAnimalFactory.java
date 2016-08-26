package com.practice.AbstractFactoryPattern;


public class LandAnimalFactory extends AnimalFactory {
   @Override
	public Animal getAnimal(String animalType){
	   Animal animal =null;
	   if ("Lion".equalsIgnoreCase(animalType)){
		   animal = new Lion();
	   }
	   else if("Horse".equalsIgnoreCase(animalType)){
		   animal = new Horse();
	   } 
	   return animal;
   }
}
